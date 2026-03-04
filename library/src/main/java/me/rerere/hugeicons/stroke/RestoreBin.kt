package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.RestoreBin: ImageVector
    get() {
        if (_restoreBin != null) {
            return _restoreBin!!
        }
        _restoreBin = ImageVector.Builder(
            name = "RestoreBin",
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
        lineTo(19f, 11.5f)
        moveTo(4.5f, 5.5f)
        lineTo(5.10461f, 15.5368f)
        curveTo(5.25945f, 18.1073f, 5.33688f, 19.3925f, 5.97868f, 20.3167f)
        curveTo(6.296f, 20.7737f, 6.7048f, 21.1594f, 7.17905f, 21.4493f)
        curveTo(7.76127f, 21.8051f, 8.46343f, 21.945f, 9.5f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 15.5f)
        lineTo(12.1363f, 16.9657f)
        curveTo(12.708f, 14.8319f, 14.9014f, 13.5655f, 17.0352f, 14.1373f)
        curveTo(18.1275f, 14.43f, 18.9925f, 15.1475f, 19.5f, 16.0646f)
        moveTo(21f, 20.5f)
        lineTo(19.8637f, 19.0363f)
        curveTo(19.2919f, 21.1701f, 17.0986f, 22.4365f, 14.9647f, 21.8647f)
        curveTo(13.8978f, 21.5788f, 13.0477f, 20.8875f, 12.5359f, 20.001f)
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

        return _restoreBin!!
    }

private var _restoreBin: ImageVector? = null
