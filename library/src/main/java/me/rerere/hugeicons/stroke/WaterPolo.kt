package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.WaterPolo: ImageVector
    get() {
        if (_waterPolo != null) {
            return _waterPolo!!
        }
        _waterPolo = ImageVector.Builder(
            name = "WaterPolo",
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
        moveTo(2f, 21.1925f)
        curveTo(2.68524f, 22.2429f, 3.57104f, 22.2429f, 4.27299f, 21.1925f)
        curveTo(6.52985f, 17.7424f, 8.67954f, 23.6741f, 10.273f, 21.2314f)
        curveTo(12.703f, 17.5711f, 14.4508f, 23.9193f, 16.273f, 21.1925f)
        curveTo(18.6492f, 17.5599f, 20.1295f, 23.5754f, 22f, 21.5833f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.6184f, 17.0101f)
        curveTo(18.3131f, 16.4058f, 19.9447f, 14.7125f, 20.3627f, 12.0914f)
        curveTo(20.7506f, 10.4812f, 20.5232f, 6.9041f, 17.9129f, 4.44767f)
        curveTo(16.1746f, 2.71046f, 11.565f, 0.185186f, 6.5503f, 3.98173f)
        curveTo(5.54789f, 4.78962f, 3.71926f, 7.01343f, 3.51106f, 9.93539f)
        curveTo(3.30286f, 12.8574f, 4.57349f, 14.8476f, 5.22063f, 15.6302f)
        curveTo(5.53845f, 15.974f, 5.6944f, 16.1756f, 6.02643f, 16.4762f)
        curveTo(6.31267f, 16.7353f, 6.43154f, 16.8203f, 6.66416f, 17.0076f)
        curveTo(8.07023f, 17.0604f, 11.2393f, 16.4052f, 13.3709f, 15.0443f)
        curveTo(13.8436f, 14.8221f, 15.0503f, 14.0541f, 16.0332f, 12.6903f)
        moveTo(4.17227f, 12.8032f)
        curveTo(5.35359f, 13.2754f, 8.38935f, 13.8311f, 11.3207f, 11.1072f)
        moveTo(11.5404f, 10.8749f)
        curveTo(12.976f, 10.5733f, 16.5886f, 10.8749f, 18.8331f, 14.8069f)
        moveTo(7.6968f, 3.48867f)
        curveTo(6.58965f, 5.43319f, 6.33215f, 10.6019f, 7.92835f, 12.5251f)
        moveTo(11.6466f, 10.8895f)
        curveTo(10.8934f, 9.0532f, 10.3472f, 4.55944f, 12.095f, 2.24888f)
        moveTo(11.5124f, 6.34147f)
        curveTo(13.2591f, 6.07737f, 17.575f, 6.92221f, 20.4894f, 10.5016f)
        }
        }.build()

        return _waterPolo!!
    }

private var _waterPolo: ImageVector? = null
