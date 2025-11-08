package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BabyBoyDress: ImageVector
    get() {
        if (_babyBoyDress != null) {
            return _babyBoyDress!!
        }
        _babyBoyDress = ImageVector.Builder(
            name = "BabyBoyDress",
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
        moveTo(5.94724f, 9.003f)
        curveTo(5.94724f, 9.003f, 3.68265f, 11.252f, 3.01654f, 10.9766f)
        curveTo(2.07687f, 10.5882f, 1.67051f, 6.8204f, 2.30951f, 6.24512f)
        lineTo(4.76679f, 4.03287f)
        curveTo(5.90144f, 3.01137f, 5.93084f, 3f, 7.43853f, 3f)
        horizontalLineTo(8.95703f)
        curveTo(9.1835f, 4.3592f, 10.4956f, 5.99207f, 12f, 5.99207f)
        curveTo(13.5044f, 5.99207f, 14.8165f, 4.3592f, 15.043f, 3f)
        horizontalLineTo(16.5615f)
        curveTo(18.0692f, 3f, 18.0986f, 3.01136f, 19.2332f, 4.03287f)
        lineTo(21.6905f, 6.24512f)
        curveTo(22.3295f, 6.8204f, 21.9231f, 10.5882f, 20.9835f, 10.9766f)
        curveTo(20.3173f, 11.252f, 18.0489f, 9.003f, 18.0489f, 9.003f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 8f)
        verticalLineTo(18.5267f)
        curveTo(6f, 19.2323f, 6.11985f, 19.6092f, 6.75491f, 19.9496f)
        curveTo(9.3676f, 21.3501f, 14.6324f, 21.3501f, 17.2451f, 19.9496f)
        curveTo(17.8802f, 19.6092f, 18f, 19.2323f, 18f, 18.5267f)
        lineTo(18f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 10f)
        curveTo(8f, 12.6667f, 16f, 12.6667f, 18f, 10f)
        }
        }.build()

        return _babyBoyDress!!
    }

private var _babyBoyDress: ImageVector? = null
