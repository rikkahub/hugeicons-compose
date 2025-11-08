package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Road: ImageVector
    get() {
        if (_road != null) {
            return _road!!
        }
        _road = ImageVector.Builder(
            name = "Road",
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
        moveTo(2f, 21.9979f)
        verticalLineTo(11.9955f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 21.9979f)
        verticalLineTo(11.9955f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 21.9974f)
        verticalLineTo(20.9977f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 17.9964f)
        verticalLineTo(16.9967f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.72533f, 5.65438f)
        lineTo(6.55526f, 6.41335f)
        moveTo(6.55526f, 6.41335f)
        curveTo(6.71446f, 6.14502f, 6.99041f, 5.67493f, 7.08183f, 5.38084f)
        curveTo(7.88067f, 2.81094f, 7.95145f, 2.10297f, 9.18504f, 2.00183f)
        horizontalLineTo(14.8119f)
        curveTo(16.0455f, 2.10297f, 16.1163f, 2.81094f, 16.9151f, 5.38084f)
        curveTo(17.0065f, 5.67493f, 17.2326f, 6.14502f, 17.3918f, 6.41335f)
        moveTo(6.55526f, 6.41335f)
        curveTo(5.95054f, 7.43262f, 5.1493f, 8.09969f, 5.02924f, 8.98037f)
        curveTo(5.0096f, 9.12441f, 5.02924f, 10.7318f, 5.02924f, 11.898f)
        curveTo(5.02924f, 12.7742f, 5.87312f, 12.7475f, 6.69535f, 12.8157f)
        curveTo(7.21787f, 12.859f, 7.74116f, 12.9538f, 8.26545f, 12.9592f)
        curveTo(11.1713f, 12.9888f, 13.0926f, 12.9919f, 15.9671f, 12.9606f)
        curveTo(16.5229f, 12.9545f, 17.083f, 12.85f, 17.637f, 12.803f)
        curveTo(18.2625f, 12.7499f, 18.9165f, 12.6794f, 18.9677f, 11.898f)
        curveTo(19.044f, 10.733f, 18.9873f, 9.12441f, 18.9677f, 8.98037f)
        curveTo(18.8476f, 8.09969f, 17.9965f, 7.43262f, 17.3918f, 6.41335f)
        moveTo(6.55526f, 6.41335f)
        horizontalLineTo(17.3918f)
        moveTo(17.3918f, 6.41335f)
        lineTo(18.364f, 5.65438f)
        moveTo(5.20362f, 8.42936f)
        lineTo(6.41209f, 9.34913f)
        moveTo(10.5581f, 10.5112f)
        lineTo(13.4968f, 10.5112f)
        moveTo(17.6201f, 9.32635f)
        lineTo(18.9548f, 8.90078f)
        moveTo(7.08183f, 12.855f)
        lineTo(7.00382f, 14.4987f)
        moveTo(16.9822f, 12.8755f)
        verticalLineTo(14.4987f)
        }
        }.build()

        return _road!!
    }

private var _road: ImageVector? = null
