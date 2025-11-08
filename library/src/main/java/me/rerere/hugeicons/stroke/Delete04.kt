package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Delete04: ImageVector
    get() {
        if (_delete04 != null) {
            return _delete04!!
        }
        _delete04 = ImageVector.Builder(
            name = "Delete04",
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
        moveTo(19.5f, 5.5f)
        lineTo(19.0982f, 12.0062f)
        moveTo(4.5f, 5.5f)
        lineTo(5.10461f, 15.5248f)
        curveTo(5.25945f, 18.0922f, 5.33688f, 19.3759f, 5.97868f, 20.299f)
        curveTo(6.296f, 20.7554f, 6.7048f, 21.1407f, 7.17905f, 21.4302f)
        curveTo(7.85035f, 21.84f, 8.68108f, 21.9631f, 10f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 15f)
        lineTo(13f, 21.9995f)
        moveTo(20f, 22f)
        lineTo(13f, 15.0005f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 5.5f)
        horizontalLineTo(21f)
        moveTo(16.0557f, 5.5f)
        lineTo(15.3731f, 4.09173f)
        curveTo(14.9196f, 3.15626f, 14.6928f, 2.68852f, 14.3017f, 2.39681f)
        curveTo(14.215f, 2.3321f, 14.1231f, 2.27454f, 14.027f, 2.2247f)
        curveTo(13.5939f, 2f, 13.0741f, 2f, 12.0345f, 2f)
        curveTo(10.9688f, 2f, 10.436f, 2f, 9.99568f, 2.23412f)
        curveTo(9.8981f, 2.28601f, 9.80498f, 2.3459f, 9.71729f, 2.41317f)
        curveTo(9.32164f, 2.7167f, 9.10063f, 3.20155f, 8.65861f, 4.17126f)
        lineTo(8.05292f, 5.5f)
        }
        }.build()

        return _delete04!!
    }

private var _delete04: ImageVector? = null
