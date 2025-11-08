package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PoundCircle: ImageVector
    get() {
        if (_poundCircle != null) {
            return _poundCircle!!
        }
        _poundCircle = ImageVector.Builder(
            name = "PoundCircle",
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
        moveTo(22f, 12f)
        curveTo(22f, 17.5228f, 17.5228f, 22f, 12f, 22f)
        curveTo(6.47715f, 22f, 2f, 17.5228f, 2f, 12f)
        curveTo(2f, 6.47715f, 6.47715f, 2f, 12f, 2f)
        curveTo(17.5228f, 2f, 22f, 6.47715f, 22f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.0691f, 10.2343f)
        curveTo(15.0288f, 9.65438f, 14.7219f, 8.24931f, 13.5421f, 7.73018f)
        curveTo(12.0674f, 7.08127f, 10.1256f, 7.89786f, 9.94389f, 10.0012f)
        curveTo(9.85864f, 10.9881f, 10.3367f, 12.0229f, 11.0314f, 12.5341f)
        curveTo(11.6697f, 13.0039f, 12.6382f, 12.9801f, 13.5421f, 12.9801f)
        horizontalLineTo(8.52637f)
        moveTo(11.5563f, 12.9801f)
        curveTo(11.3863f, 13.6696f, 10.4532f, 15.6515f, 8.96629f, 16.4786f)
        horizontalLineTo(14.3772f)
        curveTo(14.5866f, 16.4786f, 15.1772f, 16.5332f, 16.0135f, 15.9332f)
        }
        }.build()

        return _poundCircle!!
    }

private var _poundCircle: ImageVector? = null
