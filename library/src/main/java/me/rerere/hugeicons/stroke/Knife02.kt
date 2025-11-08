package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Knife02: ImageVector
    get() {
        if (_knife02 != null) {
            return _knife02!!
        }
        _knife02 = ImageVector.Builder(
            name = "Knife02",
            defaultWidth = 25.dp,
            defaultHeight = 24.dp,
            viewportWidth = 25f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.1468f, 17.7161f)
        curveTo(14.5276f, 17.6191f, 14.8277f, 17.2686f, 15.4279f, 16.5674f)
        lineTo(20.6144f, 10.5083f)
        curveTo(22.5236f, 8.27791f, 23.2538f, 5.16032f, 21.5179f, 2.53909f)
        curveTo(20.9426f, 1.67029f, 19.9814f, 1.97862f, 19.3802f, 2.57285f)
        lineTo(3.07422f, 18.6916f)
        curveTo(2.30859f, 19.4484f, 2.30859f, 20.6755f, 3.07422f, 21.4323f)
        curveTo(3.94222f, 22.2903f, 5.38535f, 22.1577f, 6.07852f, 21.1563f)
        curveTo(7.02528f, 19.7884f, 8.50705f, 16.2711f, 10.1582f, 15.6456f)
        curveTo(11.871f, 14.9968f, 12.4676f, 18.1437f, 14.1468f, 17.7161f)
        }
        }.build()

        return _knife02!!
    }

private var _knife02: ImageVector? = null
