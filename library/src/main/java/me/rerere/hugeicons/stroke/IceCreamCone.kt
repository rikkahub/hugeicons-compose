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

val HugeIcons.IceCreamCone: ImageVector
    get() {
        if (_iceCreamCone != null) {
            return _iceCreamCone!!
        }
        _iceCreamCone = ImageVector.Builder(
            name = "IceCreamCone",
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
            moveTo(7.5f, 12f)
            lineTo(9.25585f, 17.0764f)
            curveTo(10.3991f, 20.3817f, 10.9701f, 21.9997f, 11.9966f, 22f)
            curveTo(13.023f, 22.0003f, 13.5961f, 20.3825f, 14.741f, 17.0777f)
            lineTo(16.5f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(9.49521f, 11.3283f)
            curveTo(9.80924f, 10.9751f, 10f, 10.5098f, 10f, 10f)
            curveTo(10f, 11.1046f, 10.8954f, 12f, 12f, 12f)
            curveTo(13.1046f, 12f, 14f, 11.1046f, 14f, 10f)
            curveTo(14f, 10.5098f, 14.1908f, 10.9751f, 14.5048f, 11.3283f)
            curveTo(14.8711f, 11.7404f, 15.4052f, 12f, 16f, 12f)
            curveTo(17.1046f, 12f, 18f, 11.1046f, 18f, 10f)
            curveTo(18f, 9.63376f, 17.9016f, 9.29052f, 17.7297f, 8.99528f)
            curveTo(17.3126f, 8.27878f, 17.1041f, 7.92053f, 17.0794f, 7.86252f)
            curveTo(16.9854f, 7.64092f, 17.0381f, 7.83624f, 17.0079f, 7.59742f)
            curveTo(17f, 7.53491f, 17f, 7.3566f, 17f, 7f)
            curveTo(17f, 4.23858f, 14.7614f, 2f, 12f, 2f)
            curveTo(9.23858f, 2f, 7f, 4.23858f, 7f, 7f)
            curveTo(7f, 7.3566f, 7f, 7.53491f, 6.99209f, 7.59742f)
            curveTo(6.96187f, 7.83624f, 7.01458f, 7.64092f, 6.92055f, 7.86252f)
            curveTo(6.89594f, 7.92052f, 6.68739f, 8.27878f, 6.2703f, 8.99528f)
            curveTo(6.09844f, 9.29052f, 6f, 9.63376f, 6f, 10f)
            curveTo(6f, 11.1046f, 6.89543f, 12f, 8f, 12f)
            curveTo(8.59475f, 12f, 9.12887f, 11.7404f, 9.49521f, 11.3283f)
            close()
        }
        }.build()

        return _iceCreamCone!!
    }

private var _iceCreamCone: ImageVector? = null
