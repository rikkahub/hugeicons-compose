package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Touch01: ImageVector
    get() {
        if (_touch01 != null) {
            return _touch01!!
        }
        _touch01 = ImageVector.Builder(
            name = "Touch01",
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
        moveTo(17.8933f, 21.9882f)
        curveTo(17.8416f, 20.075f, 17.9705f, 19.8446f, 18.1072f, 19.419f)
        curveTo(18.2439f, 18.9934f, 19.2002f, 17.4585f, 19.5386f, 16.3619f)
        curveTo(20.6334f, 12.814f, 19.613f, 12.0594f, 18.2527f, 11.0533f)
        curveTo(16.7442f, 9.93752f, 13.8989f, 9.37245f, 12.4878f, 9.49478f)
        verticalLineTo(3.74357f)
        curveTo(12.4878f, 2.78062f, 11.7069f, 2f, 10.7435f, 2f)
        curveTo(9.78021f, 2f, 8.99928f, 2.78062f, 8.99928f, 3.74357f)
        verticalLineTo(14.0031f)
        lineTo(6.93911f, 11.8237f)
        curveTo(6.29949f, 11.1302f, 5.27158f, 11.0599f, 4.57004f, 11.6907f)
        curveTo(3.90523f, 12.2885f, 3.80821f, 13.2952f, 4.34664f, 14.0089f)
        lineTo(5.63899f, 15.7218f)
        moveTo(8.86993f, 22f)
        lineTo(8.85039f, 20.9496f)
        curveTo(8.89334f, 19.7183f, 7.99734f, 18.9149f, 6.82877f, 17.3087f)
        curveTo(6.74457f, 17.193f, 6.66264f, 17.0811f, 6.58287f, 16.9729f)
        moveTo(6.58287f, 16.9729f)
        curveTo(6.22881f, 16.4924f, 5.91728f, 16.0831f, 5.63899f, 15.7218f)
        moveTo(6.58287f, 16.9729f)
        lineTo(7.75229f, 18.5229f)
        moveTo(6.58287f, 16.9729f)
        lineTo(5.63899f, 15.7218f)
        moveTo(5.63899f, 15.7218f)
        curveTo(5.06761f, 14.9801f, 4.63629f, 14.441f, 4.26446f, 13.9055f)
        }
        }.build()

        return _touch01!!
    }

private var _touch01: ImageVector? = null
