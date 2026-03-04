package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArrowLeftBig: ImageVector
    get() {
        if (_arrowLeftBig != null) {
            return _arrowLeftBig!!
        }
        _arrowLeftBig = ImageVector.Builder(
            name = "ArrowLeftBig",
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
        moveTo(11.5f, 8.45596f)
        verticalLineTo(9f)
        lineTo(17.5f, 9f)
        curveTo(18.4319f, 9f, 18.8978f, 9f, 19.2654f, 9.15224f)
        curveTo(19.7554f, 9.35523f, 20.1448f, 9.74458f, 20.3478f, 10.2346f)
        curveTo(20.5f, 10.6022f, 20.5f, 11.0681f, 20.5f, 12f)
        curveTo(20.5f, 12.9319f, 20.5f, 13.3978f, 20.3478f, 13.7654f)
        curveTo(20.1448f, 14.2554f, 19.7554f, 14.6448f, 19.2654f, 14.8478f)
        curveTo(18.8978f, 15f, 18.4319f, 15f, 17.5f, 15f)
        horizontalLineTo(11.5f)
        verticalLineTo(15.544f)
        curveTo(11.5f, 17.6268f, 11.5f, 18.6681f, 10.8997f, 18.9422f)
        curveTo(10.2994f, 19.2163f, 9.58174f, 18.5026f, 8.14642f, 17.0751f)
        lineTo(4.58281f, 13.5311f)
        curveTo(3.86094f, 12.8132f, 3.5f, 12.4542f, 3.5f, 12f)
        curveTo(3.5f, 11.5458f, 3.86094f, 11.1868f, 4.58281f, 10.4689f)
        lineTo(8.14643f, 6.92487f)
        curveTo(9.58175f, 5.49743f, 10.2994f, 4.78372f, 10.8997f, 5.05779f)
        curveTo(11.5f, 5.33185f, 11.5f, 6.37322f, 11.5f, 8.45596f)
        }
        }.build()

        return _arrowLeftBig!!
    }

private var _arrowLeftBig: ImageVector? = null
