package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Lantern: ImageVector
    get() {
        if (_lantern != null) {
            return _lantern!!
        }
        _lantern = ImageVector.Builder(
            name = "Lantern",
            defaultWidth = 25.dp,
            defaultHeight = 24.dp,
            viewportWidth = 25f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.5f, 7.5f)
        curveTo(7.21663f, 5.40983f, 9.22856f, 4f, 11.4947f, 4f)
        horizontalLineTo(13.5053f)
        curveTo(15.7714f, 4f, 17.7834f, 5.40983f, 18.5f, 7.5f)
        horizontalLineTo(6.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.5f, 18.5f)
        curveTo(17.7834f, 20.5902f, 15.7714f, 22f, 13.5053f, 22f)
        lineTo(11.4947f, 22f)
        curveTo(9.22855f, 22f, 7.21663f, 20.5902f, 6.5f, 18.5f)
        lineTo(18.5f, 18.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.5f, 7.5f)
        horizontalLineTo(5.5f)
        lineTo(6.5f, 8.5f)
        moveTo(18.5f, 7.5f)
        horizontalLineTo(19.5f)
        lineTo(18.5f, 8.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.5f, 18.5f)
        lineTo(19.5f, 18.5f)
        lineTo(18.5f, 17.5f)
        moveTo(6.5f, 18.5f)
        lineTo(5.5f, 18.5f)
        lineTo(6.5f, 17.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.5f, 11f)
        lineTo(22.5f, 10.5f)
        moveTo(21.5f, 15f)
        lineTo(22.5f, 15.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.5f, 11f)
        lineTo(2.5f, 10.5f)
        moveTo(3.5f, 15f)
        lineTo(2.5f, 15.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.5f, 12f)
        verticalLineTo(14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.5f, 2f)
        verticalLineTo(4f)
        }
        }.build()

        return _lantern!!
    }

private var _lantern: ImageVector? = null
