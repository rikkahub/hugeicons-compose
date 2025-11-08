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
        moveTo(18f, 18f)
        curveTo(17.7128f, 17.2408f, 17.4563f, 16.1375f, 16.5f, 15.5f)
        curveTo(15f, 14.5f, 13.5f, 14f, 13.5f, 12.5f)
        curveTo(13.5f, 11f, 13f, 8f, 13f, 8f)
        lineTo(13.6955f, 7.26803f)
        curveTo(15.3935f, 8.02463f, 17f, 5.88071f, 17f, 4.5f)
        curveTo(17f, 3.11929f, 15.8807f, 2f, 14.5f, 2f)
        curveTo(13.1193f, 2f, 12f, 3.11929f, 12f, 4.5f)
        curveTo(12f, 5.5f, 11.2f, 6.1f, 10f, 6.5f)
        curveTo(8.5f, 7f, 6.5f, 8f, 6.5f, 13f)
        curveTo(6.5f, 17f, 8.33333f, 18.3333f, 9f, 19f)
        curveTo(5.8f, 19f, 5f, 21f, 5f, 22f)
        horizontalLineTo(18f)
        curveTo(19.1046f, 22f, 20f, 21.1046f, 20f, 20f)
        curveTo(20f, 18.8954f, 19.1046f, 18f, 18f, 18f)
        moveTo(18f, 18f)
        curveTo(10.2719f, 18f, 9.55992f, 13.3333f, 10f, 11f)
        }
        }.build()

        return _salah!!
    }

private var _salah: ImageVector? = null
