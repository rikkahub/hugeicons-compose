package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Nut: ImageVector
    get() {
        if (_nut != null) {
            return _nut!!
        }
        _nut = ImageVector.Builder(
            name = "Nut",
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
        moveTo(8.8973f, 6.08458f)
        curveTo(6.64279f, 6.79018f, 3.96587f, 8.62574f, 2.86371f, 10.6418f)
        curveTo(2.23423f, 11.5878f, 1.48908f, 13.776f, 2.48323f, 17.1684f)
        curveTo(2.66517f, 17.9528f, 3.02601f, 19.6529f, 2.80768f, 20.1862f)
        curveTo(3.3379f, 19.9666f, 5.02795f, 20.3296f, 5.80769f, 20.5126f)
        curveTo(9.18004f, 21.5127f, 11.3553f, 20.7631f, 12.2957f, 20.1299f)
        curveTo(14.2998f, 19.0212f, 16.1245f, 16.3283f, 16.826f, 14.0604f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22.001f, 4.91385f)
        curveTo(21.3544f, 4.46681f, 19.5601f, 3.88112f, 17.6999f, 5.34815f)
        moveTo(15.8049f, 4.08838f)
        curveTo(13.1452f, 2.66152f, 11.0115f, 2.88592f, 9.84114f, 3.37043f)
        curveTo(9.6518f, 3.44881f, 9.47979f, 3.56968f, 9.35958f, 3.73636f)
        curveTo(8.43064f, 5.02442f, 9.61053f, 6.96877f, 11.8955f, 9.75483f)
        curveTo(12.2745f, 10.217f, 12.6972f, 10.6438f, 13.156f, 11.0259f)
        curveTo(15.8603f, 13.2781f, 17.961f, 14.5919f, 19.2548f, 13.6261f)
        curveTo(19.3961f, 13.5207f, 19.5028f, 13.3754f, 19.5767f, 13.2148f)
        curveTo(20.2169f, 11.8243f, 20.0993f, 9.53093f, 18.7963f, 7.08782f)
        curveTo(18.1184f, 5.81677f, 17.0703f, 4.76723f, 15.8049f, 4.08838f)
        }
        }.build()

        return _nut!!
    }

private var _nut: ImageVector? = null
