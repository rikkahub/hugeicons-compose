package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.GoBackward15Sec: ImageVector
    get() {
        if (_goBackward15Sec != null) {
            return _goBackward15Sec!!
        }
        _goBackward15Sec = ImageVector.Builder(
            name = "GoBackward15Sec",
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
        moveTo(12f, 5f)
        lineTo(10.8961f, 3.45459f)
        curveTo(10.4851f, 2.87911f, 10.2795f, 2.59137f, 10.4093f, 2.32411f)
        curveTo(10.5391f, 2.05684f, 10.8689f, 2.04153f, 11.5286f, 2.01092f)
        curveTo(11.6848f, 2.00367f, 11.842f, 2f, 12f, 2f)
        curveTo(17.5228f, 2f, 22f, 6.47715f, 22f, 12f)
        curveTo(22f, 17.5228f, 17.5228f, 22f, 12f, 22f)
        curveTo(6.47715f, 22f, 2f, 17.5228f, 2f, 12f)
        curveTo(2f, 8.72836f, 3.57111f, 5.82368f, 6f, 3.99927f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 10.9997f)
        curveTo(8.528f, 10.5797f, 9.008f, 9.8871f, 9.308f, 10.0157f)
        curveTo(9.608f, 10.1442f, 9.512f, 10.5677f, 9.512f, 11.2277f)
        curveTo(9.512f, 11.8877f, 9.512f, 14.6804f, 9.512f, 16.0037f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 10f)
        horizontalLineTo(13.3595f)
        curveTo(13.1212f, 10f, 12.916f, 10.1682f, 12.8692f, 10.4019f)
        lineTo(12.504f, 12.504f)
        curveTo(13.14f, 12.24f, 13.4607f, 12.1429f, 14.1766f, 12.1429f)
        curveTo(15.2126f, 12.1429f, 16.104f, 12.78f, 16.002f, 14.1f)
        curveTo(16.02f, 15.66f, 14.76f, 16.02f, 14.1766f, 16f)
        curveTo(13.5931f, 15.98f, 12.66f, 16.2f, 12.5f, 15f)
        }
        }.build()

        return _goBackward15Sec!!
    }

private var _goBackward15Sec: ImageVector? = null
