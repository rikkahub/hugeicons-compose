package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Desk: ImageVector
    get() {
        if (_desk != null) {
            return _desk!!
        }
        _desk = ImageVector.Builder(
            name = "Desk",
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
        moveTo(3f, 8f)
        horizontalLineTo(21f)
        verticalLineTo(12f)
        curveTo(21f, 14.357f, 21f, 15.5355f, 20.2678f, 16.2678f)
        curveTo(19.5355f, 17f, 18.357f, 17f, 16f, 17f)
        horizontalLineTo(8f)
        curveTo(5.64298f, 17f, 4.46447f, 17f, 3.73223f, 16.2678f)
        curveTo(3f, 15.5355f, 3f, 14.357f, 3f, 12f)
        verticalLineTo(8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 6f)
        curveTo(7f, 4.11438f, 7f, 3.17157f, 7.58579f, 2.58579f)
        curveTo(8.17157f, 2f, 9.11438f, 2f, 11f, 2f)
        horizontalLineTo(13f)
        curveTo(14.8856f, 2f, 15.8284f, 2f, 16.4142f, 2.58579f)
        curveTo(17f, 3.17157f, 17f, 4.11438f, 17f, 6f)
        verticalLineTo(8f)
        horizontalLineTo(7f)
        verticalLineTo(6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 17f)
        verticalLineTo(22f)
        moveTo(19f, 17f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 17f)
        verticalLineTo(20f)
        moveTo(16f, 17f)
        verticalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 8f)
        lineTo(3.81818f, 8f)
        moveTo(20.1818f, 8f)
        lineTo(22f, 8f)
        }
        }.build()

        return _desk!!
    }

private var _desk: ImageVector? = null
