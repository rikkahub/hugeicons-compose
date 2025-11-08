package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Obtuse: ImageVector
    get() {
        if (_obtuse != null) {
            return _obtuse!!
        }
        _obtuse = ImageVector.Builder(
            name = "Obtuse",
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
        moveTo(22.0007f, 17f)
        curveTo(22.0007f, 17.5602f, 19.9999f, 19f, 19.9999f, 19f)
        moveTo(22.0007f, 17f)
        curveTo(22.0007f, 16.4398f, 19.9999f, 15f, 19.9999f, 15f)
        moveTo(22.0007f, 17f)
        horizontalLineTo(11.5039f)
        curveTo(10.2864f, 17f, 9.6776f, 17f, 9.19076f, 16.6953f)
        curveTo(8.70393f, 16.3905f, 8.43793f, 15.8429f, 7.90594f, 14.7478f)
        lineTo(2.70815f, 4.04763f)
        moveTo(2.70815f, 4.04763f)
        curveTo(2.23858f, 4.32009f, 2f, 6.70598f, 2f, 6.70598f)
        moveTo(2.70815f, 4.04763f)
        curveTo(3.17772f, 3.77517f, 5.35295f, 4.76046f, 5.35295f, 4.76046f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 10.8027f)
        curveTo(6.88252f, 10.2922f, 7.90714f, 10f, 9f, 10f)
        curveTo(12.3137f, 10f, 15f, 12.6863f, 15f, 16f)
        curveTo(15f, 16.3407f, 14.9716f, 16.6748f, 14.917f, 17f)
        }
        }.build()

        return _obtuse!!
    }

private var _obtuse: ImageVector? = null
