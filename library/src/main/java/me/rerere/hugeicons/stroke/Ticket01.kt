package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Ticket01: ImageVector
    get() {
        if (_ticket01 != null) {
            return _ticket01!!
        }
        _ticket01 = ImageVector.Builder(
            name = "Ticket01",
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
        moveTo(2.46433f, 9.34375f)
        curveTo(2.21579f, 9.34375f, 1.98899f, 9.14229f, 2.00041f, 8.87895f)
        curveTo(2.06733f, 7.33687f, 2.25481f, 6.33298f, 2.78008f, 5.53884f)
        curveTo(3.08228f, 5.08196f, 3.45765f, 4.68459f, 3.88923f, 4.36468f)
        curveTo(5.05575f, 3.5f, 6.70139f, 3.5f, 9.99266f, 3.5f)
        horizontalLineTo(14.0074f)
        curveTo(17.2986f, 3.5f, 18.9443f, 3.5f, 20.1108f, 4.36468f)
        curveTo(20.5424f, 4.68459f, 20.9177f, 5.08196f, 21.2199f, 5.53884f)
        curveTo(21.7452f, 6.33289f, 21.9327f, 7.33665f, 21.9996f, 8.87843f)
        curveTo(22.011f, 9.14208f, 21.7839f, 9.34375f, 21.5351f, 9.34375f)
        curveTo(20.1493f, 9.34375f, 19.0259f, 10.533f, 19.0259f, 12f)
        curveTo(19.0259f, 13.467f, 20.1493f, 14.6562f, 21.5351f, 14.6562f)
        curveTo(21.7839f, 14.6562f, 22.011f, 14.8579f, 21.9996f, 15.1216f)
        curveTo(21.9327f, 16.6634f, 21.7452f, 17.6671f, 21.2199f, 18.4612f)
        curveTo(20.9177f, 18.918f, 20.5424f, 19.3154f, 20.1108f, 19.6353f)
        curveTo(18.9443f, 20.5f, 17.2986f, 20.5f, 14.0074f, 20.5f)
        horizontalLineTo(9.99266f)
        curveTo(6.70139f, 20.5f, 5.05575f, 20.5f, 3.88923f, 19.6353f)
        curveTo(3.45765f, 19.3154f, 3.08228f, 18.918f, 2.78008f, 18.4612f)
        curveTo(2.25481f, 17.667f, 2.06733f, 16.6631f, 2.00041f, 15.1211f)
        curveTo(1.98899f, 14.8577f, 2.21579f, 14.6562f, 2.46433f, 14.6562f)
        curveTo(3.85012f, 14.6562f, 4.97352f, 13.467f, 4.97352f, 12f)
        curveTo(4.97352f, 10.533f, 3.85012f, 9.34375f, 2.46433f, 9.34375f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 3.5f)
        lineTo(9f, 20.5f)
        }
        }.build()

        return _ticket01!!
    }

private var _ticket01: ImageVector? = null
