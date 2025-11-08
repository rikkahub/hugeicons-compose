package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SixSquare: ImageVector
    get() {
        if (_sixSquare != null) {
            return _sixSquare!!
        }
        _sixSquare = ImageVector.Builder(
            name = "SixSquare",
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
        moveTo(2.99707f, 12f)
        curveTo(2.99707f, 7.52166f, 2.99707f, 5.28249f, 4.38831f, 3.89124f)
        curveTo(5.77956f, 2.5f, 8.01873f, 2.5f, 12.4971f, 2.5f)
        curveTo(16.9754f, 2.5f, 19.2146f, 2.5f, 20.6058f, 3.89124f)
        curveTo(21.9971f, 5.28249f, 21.9971f, 7.52166f, 21.9971f, 12f)
        curveTo(21.9971f, 16.4783f, 21.9971f, 18.7175f, 20.6058f, 20.1088f)
        curveTo(19.2146f, 21.5f, 16.9754f, 21.5f, 12.4971f, 21.5f)
        curveTo(8.01873f, 21.5f, 5.77956f, 21.5f, 4.38831f, 20.1088f)
        curveTo(2.99707f, 18.7175f, 2.99707f, 16.4783f, 2.99707f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.4971f, 12f)
        horizontalLineTo(13.4971f)
        curveTo(14.6016f, 12f, 15.4971f, 12.8954f, 15.4971f, 14f)
        verticalLineTo(15f)
        curveTo(15.4971f, 16.1046f, 14.6016f, 17f, 13.4971f, 17f)
        horizontalLineTo(11.4971f)
        curveTo(10.3925f, 17f, 9.49707f, 16.1046f, 9.49707f, 15f)
        verticalLineTo(14f)
        curveTo(9.49707f, 12.8954f, 10.3925f, 12f, 11.4971f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.49707f, 14.5f)
        verticalLineTo(9f)
        curveTo(9.49707f, 7.89543f, 10.3925f, 7f, 11.4971f, 7f)
        horizontalLineTo(13.4971f)
        curveTo(14.6016f, 7f, 15.4971f, 7.89543f, 15.4971f, 9f)
        }
        }.build()

        return _sixSquare!!
    }

private var _sixSquare: ImageVector? = null
