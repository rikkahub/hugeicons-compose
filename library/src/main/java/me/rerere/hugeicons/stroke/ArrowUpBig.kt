package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArrowUpBig: ImageVector
    get() {
        if (_arrowUpBig != null) {
            return _arrowUpBig!!
        }
        _arrowUpBig = ImageVector.Builder(
            name = "ArrowUpBig",
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
        moveTo(15.544f, 11.5f)
        horizontalLineTo(15f)
        verticalLineTo(17.5f)
        curveTo(15f, 18.4319f, 15f, 18.8978f, 14.8478f, 19.2654f)
        curveTo(14.6448f, 19.7554f, 14.2554f, 20.1448f, 13.7654f, 20.3478f)
        curveTo(13.3978f, 20.5f, 12.9319f, 20.5f, 12f, 20.5f)
        curveTo(11.0681f, 20.5f, 10.6022f, 20.5f, 10.2346f, 20.3478f)
        curveTo(9.74458f, 20.1448f, 9.35523f, 19.7554f, 9.15224f, 19.2654f)
        curveTo(9f, 18.8978f, 9f, 18.4319f, 9f, 17.5f)
        verticalLineTo(11.5f)
        horizontalLineTo(8.45596f)
        curveTo(6.37322f, 11.5f, 5.33185f, 11.5f, 5.05779f, 10.8997f)
        curveTo(4.78372f, 10.2994f, 5.49744f, 9.58174f, 6.92487f, 8.14642f)
        lineTo(10.4689f, 4.58281f)
        curveTo(11.1868f, 3.86094f, 11.5458f, 3.5f, 12f, 3.5f)
        curveTo(12.4542f, 3.5f, 12.8132f, 3.86094f, 13.5311f, 4.58281f)
        lineTo(17.0751f, 8.14643f)
        curveTo(18.5026f, 9.58175f, 19.2163f, 10.2994f, 18.9422f, 10.8997f)
        curveTo(18.6681f, 11.5f, 17.6268f, 11.5f, 15.544f, 11.5f)
        }
        }.build()

        return _arrowUpBig!!
    }

private var _arrowUpBig: ImageVector? = null
