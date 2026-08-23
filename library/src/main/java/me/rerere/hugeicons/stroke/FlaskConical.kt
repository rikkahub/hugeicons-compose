package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FlaskConical: ImageVector
    get() {
        if (_flaskConical != null) {
            return _flaskConical!!
        }
        _flaskConical = ImageVector.Builder(
            name = "FlaskConical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(14.4973f, 2f)
            verticalLineTo(8.25401f)
            curveTo(14.4973f, 8.72617f, 14.7093f, 9.1734f, 15.0747f, 9.47239f)
            lineTo(15.7421f, 10.0184f)
            curveTo(18.4717f, 12.2518f, 20.2277f, 15.4577f, 20.6397f, 18.9604f)
            curveTo(20.8301f, 20.5784f, 19.5659f, 22f, 17.9368f, 22f)
            horizontalLineTo(6.05789f)
            curveTo(4.42876f, 22f, 3.16459f, 20.5784f, 3.35494f, 18.9604f)
            curveTo(3.76702f, 15.4577f, 5.52295f, 12.2518f, 8.25261f, 10.0184f)
            lineTo(8.91998f, 9.47239f)
            curveTo(9.28541f, 9.1734f, 9.49734f, 8.72617f, 9.49734f, 8.25401f)
            verticalLineTo(2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(7.99707f, 2f)
            horizontalLineTo(15.9971f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(5.49707f, 14.0183f)
            curveTo(5.74095f, 14.0063f, 5.99072f, 14f, 6.24707f, 14f)
            curveTo(9.99707f, 14f, 13.7471f, 17f, 17.4971f, 17f)
            curveTo(18.2729f, 17f, 18.9332f, 16.9384f, 19.4971f, 16.8334f)
        }
        }.build()

        return _flaskConical!!
    }

private var _flaskConical: ImageVector? = null
