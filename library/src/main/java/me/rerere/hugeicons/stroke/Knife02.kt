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
        moveTo(13.6468f, 17.7161f)
        curveTo(14.0276f, 17.6191f, 14.3277f, 17.2686f, 14.9279f, 16.5674f)
        lineTo(20.1144f, 10.5083f)
        curveTo(22.0236f, 8.27791f, 22.7538f, 5.16032f, 21.0179f, 2.53909f)
        curveTo(20.4426f, 1.67029f, 19.4814f, 1.97862f, 18.8802f, 2.57285f)
        lineTo(2.57422f, 18.6916f)
        curveTo(1.80859f, 19.4484f, 1.80859f, 20.6755f, 2.57422f, 21.4323f)
        curveTo(3.44222f, 22.2903f, 4.88535f, 22.1577f, 5.57852f, 21.1563f)
        curveTo(6.52528f, 19.7884f, 8.00705f, 16.2711f, 9.65825f, 15.6456f)
        curveTo(11.371f, 14.9968f, 11.9676f, 18.1437f, 13.6468f, 17.7161f)
        }
        }.build()

        return _knife02!!
    }

private var _knife02: ImageVector? = null
