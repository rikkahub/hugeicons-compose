package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Pentagon: ImageVector
    get() {
        if (_pentagon != null) {
            return _pentagon!!
        }
        _pentagon = ImageVector.Builder(
            name = "Pentagon",
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
        moveTo(6.20832f, 5.4051f)
        curveTo(8.97801f, 3.13503f, 10.3629f, 2f, 12f, 2f)
        curveTo(13.6371f, 2f, 15.022f, 3.13503f, 17.7917f, 5.4051f)
        lineTo(18.0484f, 5.61553f)
        curveTo(20.334f, 7.48877f, 21.4767f, 8.42539f, 21.8628f, 9.74129f)
        curveTo(22.2488f, 11.0572f, 21.7895f, 12.4503f, 20.8709f, 15.2364f)
        lineTo(20.6883f, 15.7901f)
        curveTo(19.7073f, 18.7654f, 19.2169f, 20.2531f, 18.0264f, 21.1054f)
        curveTo(16.3758f, 22.2872f, 13.9003f, 21.9578f, 12f, 21.9578f)
        curveTo(8.82548f, 21.9578f, 7.16404f, 21.9578f, 5.97359f, 21.1054f)
        curveTo(4.78315f, 20.2531f, 4.29266f, 18.7654f, 3.31167f, 15.7901f)
        lineTo(3.12909f, 15.2364f)
        curveTo(2.21048f, 12.4503f, 1.75117f, 11.0572f, 2.13722f, 9.74129f)
        curveTo(2.52326f, 8.42539f, 3.66603f, 7.48877f, 5.95157f, 5.61553f)
        lineTo(6.20832f, 5.4051f)
        }
        }.build()

        return _pentagon!!
    }

private var _pentagon: ImageVector? = null
