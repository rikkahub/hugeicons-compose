package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Gitlab: ImageVector
    get() {
        if (_gitlab != null) {
            return _gitlab!!
        }
        _gitlab = ImageVector.Builder(
            name = "Gitlab",
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
        moveTo(21.7976f, 13.0838f)
        curveTo(21.9702f, 13.7157f, 22.0566f, 14.0317f, 21.9594f, 14.3228f)
        curveTo(21.8621f, 14.6139f, 21.6031f, 14.815f, 21.0851f, 15.2172f)
        lineTo(13.2468f, 21.3025f)
        curveTo(12.6478f, 21.7675f, 12.3484f, 22f, 12f, 22f)
        curveTo(11.6516f, 22f, 11.3522f, 21.7675f, 10.7532f, 21.3025f)
        lineTo(2.91487f, 15.2172f)
        curveTo(2.39687f, 14.815f, 2.13787f, 14.6139f, 2.04065f, 14.3228f)
        curveTo(1.94343f, 14.0317f, 2.02976f, 13.7157f, 2.20243f, 13.0838f)
        lineTo(5.23081f, 2f)
        lineTo(8.08792f, 8.65441f)
        curveTo(8.34375f, 9.25025f, 8.47166f, 9.54818f, 8.72598f, 9.71557f)
        curveTo(8.98031f, 9.88296f, 9.30503f, 9.88296f, 9.95448f, 9.88296f)
        horizontalLineTo(14.0455f)
        curveTo(14.695f, 9.88296f, 15.0197f, 9.88296f, 15.274f, 9.71557f)
        curveTo(15.5283f, 9.54818f, 15.6563f, 9.25025f, 15.9121f, 8.65441f)
        lineTo(18.7692f, 2f)
        lineTo(21.7976f, 13.0838f)
        }
        }.build()

        return _gitlab!!
    }

private var _gitlab: ImageVector? = null
