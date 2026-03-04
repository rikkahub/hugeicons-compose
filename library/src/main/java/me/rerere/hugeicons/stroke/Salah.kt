package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Salah: ImageVector
    get() {
        if (_salah != null) {
            return _salah!!
        }
        _salah = ImageVector.Builder(
            name = "Salah",
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
        moveTo(17.5f, 18f)
        curveTo(17.2128f, 17.2408f, 16.9563f, 16.1375f, 16f, 15.5f)
        curveTo(14.5f, 14.5f, 13f, 14f, 13f, 12.5f)
        curveTo(13f, 11f, 12.5f, 8f, 12.5f, 8f)
        lineTo(13.1955f, 7.26803f)
        curveTo(14.8935f, 8.02463f, 16.5f, 5.88071f, 16.5f, 4.5f)
        curveTo(16.5f, 3.11929f, 15.3807f, 2f, 14f, 2f)
        curveTo(12.6193f, 2f, 11.5f, 3.11929f, 11.5f, 4.5f)
        curveTo(11.5f, 5.5f, 10.7f, 6.1f, 9.5f, 6.5f)
        curveTo(8f, 7f, 6f, 8f, 6f, 13f)
        curveTo(6f, 17f, 7.83333f, 18.3333f, 8.5f, 19f)
        curveTo(5.3f, 19f, 4.5f, 21f, 4.5f, 22f)
        horizontalLineTo(17.5f)
        curveTo(18.6046f, 22f, 19.5f, 21.1046f, 19.5f, 20f)
        curveTo(19.5f, 18.8954f, 18.6046f, 18f, 17.5f, 18f)
        moveTo(17.5f, 18f)
        curveTo(9.7719f, 18f, 9.05992f, 13.3333f, 9.5f, 11f)
        }
        }.build()

        return _salah!!
    }

private var _salah: ImageVector? = null
