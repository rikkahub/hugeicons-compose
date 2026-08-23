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

val HugeIcons.BellPlus: ImageVector
    get() {
        if (_bellPlus != null) {
            return _bellPlus!!
        }
        _bellPlus = ImageVector.Builder(
            name = "BellPlus",
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
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(14.5218f, 2.3423f)
            curveTo(14.0096f, 2.16285f, 13.4656f, 2.0496f, 12.9f, 2.01285f)
            curveTo(12.7024f, 2f, 12.4682f, 2f, 12f, 2f)
            curveTo(11.5317f, 2f, 11.2976f, 2f, 11.1f, 2.01285f)
            curveTo(8.06972f, 2.20977f, 5.65599f, 4.60304f, 5.45738f, 7.60758f)
            curveTo(5.44442f, 7.80358f, 5.44442f, 8.03572f, 5.44442f, 8.5f)
            verticalLineTo(9.8056f)
            curveTo(5.44442f, 10.5353f, 5.44442f, 10.9002f, 5.40807f, 11.254f)
            curveTo(5.29504f, 12.354f, 4.9208f, 13.4119f, 4.31599f, 14.3409f)
            curveTo(4.12146f, 14.6397f, 3.89157f, 14.9246f, 3.43183f, 15.4944f)
            lineTo(3.26064f, 15.7066f)
            curveTo(2.80212f, 16.2749f, 2.57287f, 16.559f, 2.5228f, 16.789f)
            curveTo(2.4255f, 17.2359f, 2.64625f, 17.6913f, 3.05897f, 17.8951f)
            curveTo(3.27136f, 18f, 3.63835f, 18f, 4.37233f, 18f)
            horizontalLineTo(19.6277f)
            curveTo(20.3616f, 18f, 20.7286f, 18f, 20.941f, 17.8951f)
            curveTo(21.3537f, 17.6913f, 21.5745f, 17.2359f, 21.4772f, 16.789f)
            curveTo(21.4271f, 16.559f, 21.1979f, 16.2749f, 20.7394f, 15.7066f)
            lineTo(20.5682f, 15.4944f)
            curveTo(20.1898f, 15.0255f, 19.9672f, 14.7495f, 19.7918f, 14.5f)
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
            moveTo(15f, 7.99891f)
            horizontalLineTo(21f)
            moveTo(17.995f, 11.0039f)
            lineTo(17.995f, 5.00391f)
        }
        }.build()

        return _bellPlus!!
    }

private var _bellPlus: ImageVector? = null
