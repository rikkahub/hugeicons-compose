package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.WasteRestore: ImageVector
    get() {
        if (_wasteRestore != null) {
            return _wasteRestore!!
        }
        _wasteRestore = ImageVector.Builder(
            name = "WasteRestore",
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
        moveTo(3f, 5f)
        horizontalLineTo(8.42963f)
        curveTo(9.09834f, 5f, 9.7228f, 4.6658f, 10.0937f, 4.1094f)
        lineTo(10.9063f, 2.8906f)
        curveTo(11.2772f, 2.3342f, 11.9017f, 2f, 12.5704f, 2f)
        horizontalLineTo(17.0585f)
        curveTo(17.9193f, 2f, 18.6836f, 2.55086f, 18.9558f, 3.36754f)
        lineTo(19.5f, 5f)
        moveTo(21f, 5f)
        horizontalLineTo(8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.5f, 5f)
        lineTo(19f, 11.5f)
        moveTo(4.5f, 5f)
        lineTo(5.10461f, 15.5362f)
        curveTo(5.25945f, 18.1069f, 5.33688f, 19.3923f, 5.97868f, 20.3166f)
        curveTo(6.296f, 20.7736f, 6.7048f, 21.1593f, 7.17905f, 21.4492f)
        curveTo(7.76127f, 21.8051f, 8.46343f, 21.945f, 9.5f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 15.498f)
        lineTo(12.1363f, 16.9638f)
        curveTo(12.708f, 14.8299f, 14.9014f, 13.5636f, 17.0352f, 14.1353f)
        curveTo(18.1275f, 14.428f, 18.9925f, 15.1456f, 19.5f, 16.0626f)
        moveTo(21f, 20.498f)
        lineTo(19.8637f, 19.0343f)
        curveTo(19.2919f, 21.1682f, 17.0986f, 22.4345f, 14.9647f, 21.8627f)
        curveTo(13.8978f, 21.5769f, 13.0477f, 20.8856f, 12.5359f, 19.999f)
        }
        }.build()

        return _wasteRestore!!
    }

private var _wasteRestore: ImageVector? = null
