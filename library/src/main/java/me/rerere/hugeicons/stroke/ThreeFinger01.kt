package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ThreeFinger01: ImageVector
    get() {
        if (_threeFinger01 != null) {
            return _threeFinger01!!
        }
        _threeFinger01 = ImageVector.Builder(
            name = "ThreeFinger01",
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
        moveTo(14.1816f, 5.49997f)
        curveTo(14.1816f, 4.67155f, 14.8328f, 3.99998f, 15.6361f, 3.99998f)
        curveTo(16.4394f, 3.99998f, 17.0906f, 4.67155f, 17.0906f, 5.49997f)
        lineTo(17.091f, 10.9999f)
        moveTo(14.1816f, 10.9999f)
        verticalLineTo(3.49999f)
        curveTo(14.1816f, 2.67157f, 13.5304f, 2f, 12.7271f, 2f)
        curveTo(11.9237f, 2f, 11.2725f, 2.67157f, 11.2725f, 3.49999f)
        lineTo(11.2727f, 4.99998f)
        moveTo(17.0906f, 11.9999f)
        lineTo(17.091f, 10.9999f)
        moveTo(17.091f, 10.9999f)
        curveTo(17.091f, 10.4765f, 17.5468f, 10.0783f, 18.0475f, 10.1643f)
        lineTo(18.3795f, 10.2214f)
        curveTo(19.3146f, 10.3821f, 20f, 11.2165f, 20f, 12.1942f)
        lineTo(19.9996f, 13.6667f)
        curveTo(19.9996f, 15.84f, 19.9996f, 16.9267f, 19.6786f, 17.7919f)
        curveTo(19.4924f, 18.2937f, 19.0011f, 18.9337f, 18.6083f, 19.3962f)
        curveTo(18.2685f, 19.7963f, 18.0603f, 20.3037f, 18.0603f, 20.8354f)
        verticalLineTo(22f)
        moveTo(11.2727f, 4.99998f)
        curveTo(11.2724f, 4.17185f, 10.6213f, 3.50063f, 9.81824f, 3.50063f)
        curveTo(9.01493f, 3.50063f, 8.36373f, 4.1722f, 8.36373f, 5.00062f)
        lineTo(8.36353f, 13.4623f)
        lineTo(6.79236f, 11.837f)
        curveTo(6.103f, 11.1238f, 4.96746f, 11.1889f, 4.35844f, 11.9764f)
        curveTo(3.89244f, 12.579f, 3.87957f, 13.4314f, 4.32715f, 14.0488f)
        lineTo(7.81767f, 18.647f)
        curveTo(8.4855f, 19.5267f, 8.84836f, 20.8827f, 8.84836f, 22f)
        moveTo(11.2727f, 4.99998f)
        verticalLineTo(9.99993f)
        }
        }.build()

        return _threeFinger01!!
    }

private var _threeFinger01: ImageVector? = null
