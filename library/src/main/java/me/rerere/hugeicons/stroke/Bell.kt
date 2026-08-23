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

val HugeIcons.Bell: ImageVector
    get() {
        if (_bell != null) {
            return _bell!!
        }
        _bell = ImageVector.Builder(
            name = "Bell",
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
            moveTo(16f, 18f)
            curveTo(16f, 20.2091f, 14.2091f, 22f, 12f, 22f)
            curveTo(9.79086f, 22f, 8f, 20.2091f, 8f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(4.43654f, 18f)
            horizontalLineTo(19.5625f)
            curveTo(20.2903f, 18f, 20.6542f, 18f, 20.8648f, 17.8951f)
            curveTo(21.274f, 17.6913f, 21.4929f, 17.2359f, 21.3964f, 16.789f)
            curveTo(21.3468f, 16.559f, 21.1194f, 16.2749f, 20.6648f, 15.7066f)
            lineTo(20.4951f, 15.4944f)
            curveTo(20.0392f, 14.9246f, 19.8113f, 14.6397f, 19.6184f, 14.3409f)
            curveTo(19.0187f, 13.4119f, 18.6477f, 12.354f, 18.5356f, 11.254f)
            curveTo(18.4995f, 10.9002f, 18.4995f, 10.5353f, 18.4995f, 9.8056f)
            verticalLineTo(8.5f)
            curveTo(18.4995f, 8.03572f, 18.4995f, 7.80358f, 18.4867f, 7.60758f)
            curveTo(18.2898f, 4.60304f, 15.8965f, 2.20977f, 12.892f, 2.01285f)
            curveTo(12.696f, 2f, 12.4638f, 2f, 11.9995f, 2f)
            curveTo(11.5353f, 2f, 11.3031f, 2f, 11.1071f, 2.01285f)
            curveTo(8.10258f, 2.20977f, 5.70931f, 4.60304f, 5.51239f, 7.60758f)
            curveTo(5.49954f, 7.80358f, 5.49954f, 8.03572f, 5.49954f, 8.5f)
            verticalLineTo(9.8056f)
            curveTo(5.49954f, 10.5353f, 5.49954f, 10.9002f, 5.46349f, 11.254f)
            curveTo(5.35143f, 12.354f, 4.98035f, 13.4119f, 4.38067f, 14.3409f)
            curveTo(4.18779f, 14.6397f, 3.95985f, 14.9246f, 3.50401f, 15.4944f)
            lineTo(3.33427f, 15.7066f)
            curveTo(2.87964f, 16.2749f, 2.65233f, 16.559f, 2.60268f, 16.789f)
            curveTo(2.50621f, 17.2359f, 2.72509f, 17.6913f, 3.13431f, 17.8951f)
            curveTo(3.3449f, 18f, 3.70878f, 18f, 4.43654f, 18f)
            close()
        }
        }.build()

        return _bell!!
    }

private var _bell: ImageVector? = null
