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

val HugeIcons.TongueWinkLeft: ImageVector
    get() {
        if (_tongueWinkLeft != null) {
            return _tongueWinkLeft!!
        }
        _tongueWinkLeft = ImageVector.Builder(
            name = "TongueWinkLeft",
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
            moveTo(12f, 21.9995f)
            curveTo(17.5228f, 21.9995f, 22f, 17.5223f, 22f, 11.9995f)
            curveTo(22f, 6.4766f, 17.5228f, 1.99945f, 12f, 1.99945f)
            curveTo(6.47715f, 1.99945f, 2f, 6.4766f, 2f, 11.9995f)
            curveTo(2f, 13.231f, 2.22261f, 14.4105f, 2.62979f, 15.4999f)
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
            moveTo(6.34103f, 13.9996f)
            curveTo(7.1647f, 16.33f, 9.38718f, 17.9996f, 11.9996f, 17.9996f)
            curveTo(14.6121f, 17.9996f, 16.8345f, 16.33f, 17.6582f, 13.9996f)
            moveTo(11f, 18f)
            lineTo(9.22695f, 20.7093f)
            curveTo(8.52749f, 21.9435f, 6.97838f, 22.3664f, 5.76689f, 21.6538f)
            curveTo(4.55541f, 20.9412f, 4.14032f, 19.363f, 4.83977f, 18.1287f)
            lineTo(6.61283f, 15f)
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
            moveTo(10f, 8.79915f)
            curveTo(9.65795f, 8.31337f, 9.11338f, 7.99915f, 8.5f, 7.99915f)
            curveTo(7.88662f, 7.99915f, 7.34205f, 8.31337f, 7f, 8.79915f)
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
            moveTo(16.125f, 8.38615f)
            verticalLineTo(8.91564f)
            moveTo(15.75f, 8.74915f)
            curveTo(15.75f, 8.33493f, 15.9179f, 7.99915f, 16.125f, 7.99915f)
            curveTo(16.3321f, 7.99915f, 16.5f, 8.33493f, 16.5f, 8.74915f)
            curveTo(16.5f, 9.16336f, 16.3321f, 9.49915f, 16.125f, 9.49915f)
            curveTo(15.9179f, 9.49915f, 15.75f, 9.16336f, 15.75f, 8.74915f)
            close()
        }
        }.build()

        return _tongueWinkLeft!!
    }

private var _tongueWinkLeft: ImageVector? = null
