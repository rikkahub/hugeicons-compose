package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Profit: ImageVector
    get() {
        if (_profit != null) {
            return _profit!!
        }
        _profit = ImageVector.Builder(
            name = "Profit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 2f)
        curveTo(8.13401f, 2f, 5f, 5.134f, 5f, 9f)
        curveTo(5f, 12.866f, 8.13401f, 16f, 12f, 16f)
        curveTo(15.866f, 16f, 19f, 12.866f, 19f, 9f)
        curveTo(19f, 5.13401f, 15.866f, 2f, 12f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 18f)
        curveTo(13f, 18f, 12f, 19.5f, 12f, 19.5f)
        curveTo(12f, 19.5f, 13f, 21f, 15f, 21f)
        curveTo(17f, 21f, 18f, 19.5f, 18f, 19.5f)
        curveTo(18f, 19.5f, 17f, 18f, 15f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 18f)
        curveTo(7f, 18f, 6f, 19.5f, 6f, 19.5f)
        curveTo(6f, 19.5f, 7f, 21f, 9f, 21f)
        curveTo(11f, 21f, 12f, 19.5f, 12f, 19.5f)
        curveTo(12f, 19.5f, 11f, 18f, 9f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 22f)
        verticalLineTo(16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.4375f, 11.6667f)
        lineTo(10.4375f, 6.33333f)
        moveTo(12f, 6.33333f)
        verticalLineTo(5f)
        moveTo(12f, 13f)
        verticalLineTo(11.6667f)
        moveTo(10.4375f, 9f)
        horizontalLineTo(13.5625f)
        moveTo(13.5625f, 9f)
        curveTo(14.0803f, 9f, 14.5f, 9.44772f, 14.5f, 10f)
        verticalLineTo(10.6667f)
        curveTo(14.5f, 11.219f, 14.0803f, 11.6667f, 13.5625f, 11.6667f)
        horizontalLineTo(9.5f)
        moveTo(13.5625f, 9f)
        curveTo(14.0803f, 9f, 14.5f, 8.55228f, 14.5f, 8f)
        verticalLineTo(7.33333f)
        curveTo(14.5f, 6.78105f, 14.0803f, 6.33333f, 13.5625f, 6.33333f)
        horizontalLineTo(9.5f)
        }
        }.build()

        return _profit!!
    }

private var _profit: ImageVector? = null
