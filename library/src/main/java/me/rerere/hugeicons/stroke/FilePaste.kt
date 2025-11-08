package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FilePaste: ImageVector
    get() {
        if (_filePaste != null) {
            return _filePaste!!
        }
        _filePaste = ImageVector.Builder(
            name = "FilePaste",
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
        moveTo(3.99994f, 10f)
        lineTo(3.99994f, 14.5442f)
        curveTo(3.99994f, 17.7892f, 3.99994f, 19.4117f, 4.88601f, 20.5107f)
        curveTo(5.06502f, 20.7327f, 5.26725f, 20.9349f, 5.48927f, 21.1139f)
        curveTo(6.58825f, 22f, 8.21076f, 22f, 11.4558f, 22f)
        curveTo(12.1613f, 22f, 12.5141f, 22f, 12.8371f, 21.886f)
        curveTo(12.9043f, 21.8623f, 12.9702f, 21.835f, 13.0345f, 21.8043f)
        curveTo(13.3435f, 21.6564f, 13.5929f, 21.407f, 14.0918f, 20.9081f)
        lineTo(18.8284f, 16.1716f)
        curveTo(19.4064f, 15.5935f, 19.6955f, 15.3045f, 19.8477f, 14.9369f)
        curveTo(19.9999f, 14.5694f, 19.9999f, 14.1606f, 19.9999f, 13.3431f)
        verticalLineTo(10f)
        curveTo(19.9999f, 6.22876f, 19.9999f, 4.34315f, 18.8284f, 3.17157f)
        curveTo(17.6568f, 2f, 15.7712f, 2f, 11.9999f, 2f)
        moveTo(12.9999f, 21.5f)
        verticalLineTo(21f)
        curveTo(12.9999f, 18.1716f, 12.9999f, 16.7574f, 13.8786f, 15.8787f)
        curveTo(14.7573f, 15f, 16.1715f, 15f, 18.9999f, 15f)
        horizontalLineTo(19.4999f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.99994f, 8f)
        curveTo(6.3931f, 7.41016f, 3.99994f, 5.84027f, 3.99994f, 5f)
        curveTo(3.99994f, 4.15973f, 6.3931f, 2.58984f, 6.99994f, 2f)
        moveTo(4.49994f, 5f)
        horizontalLineTo(6.99994f)
        curveTo(8.86917f, 5f, 9.80379f, 5f, 10.4999f, 5.40192f)
        curveTo(10.956f, 5.66523f, 11.3347f, 6.04394f, 11.598f, 6.5f)
        curveTo(11.9999f, 7.19615f, 11.9999f, 8.13077f, 11.9999f, 10f)
        }
        }.build()

        return _filePaste!!
    }

private var _filePaste: ImageVector? = null
