package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Saturn: ImageVector
    get() {
        if (_saturn != null) {
            return _saturn!!
        }
        _saturn = ImageVector.Builder(
            name = "Saturn",
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
        moveTo(14.8255f, 5.37555f)
        curveTo(17.6258f, 3.38071f, 19.9127f, 2.49436f, 20.7092f, 3.29084f)
        curveTo(21.5056f, 4.08733f, 20.6193f, 6.37425f, 18.6244f, 9.17452f)
        moveTo(5.37555f, 14.8255f)
        curveTo(3.38071f, 17.6258f, 2.49436f, 19.9127f, 3.29084f, 20.7092f)
        curveTo(4.08733f, 21.5056f, 6.37425f, 20.6193f, 9.17452f, 18.6244f)
        moveTo(18.6244f, 9.17452f)
        curveTo(17.4921f, 10.7641f, 16.0025f, 12.5191f, 14.2608f, 14.2608f)
        curveTo(12.5191f, 16.0025f, 10.7641f, 17.4921f, 9.17452f, 18.6244f)
        moveTo(18.6244f, 9.17452f)
        curveTo(18.9949f, 10.042f, 19.2f, 10.9971f, 19.2f, 12f)
        curveTo(19.2f, 15.9765f, 15.9765f, 19.2f, 12f, 19.2f)
        curveTo(10.9971f, 19.2f, 10.042f, 18.9949f, 9.17452f, 18.6244f)
        moveTo(17.0912f, 6.90883f)
        curveTo(15.7882f, 5.60589f, 13.9882f, 4.8f, 12f, 4.8f)
        curveTo(8.02355f, 4.8f, 4.8f, 8.02355f, 4.8f, 12f)
        curveTo(4.8f, 13.9882f, 5.60589f, 15.7882f, 6.90883f, 17.0912f)
        }
        }.build()

        return _saturn!!
    }

private var _saturn: ImageVector? = null
