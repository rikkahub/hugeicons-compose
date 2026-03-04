package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArrowRightBig: ImageVector
    get() {
        if (_arrowRightBig != null) {
            return _arrowRightBig!!
        }
        _arrowRightBig = ImageVector.Builder(
            name = "ArrowRightBig",
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
        moveTo(12.5f, 8.45596f)
        verticalLineTo(9f)
        lineTo(6.5f, 9f)
        curveTo(5.56812f, 9f, 5.10218f, 9f, 4.73463f, 9.15224f)
        curveTo(4.24458f, 9.35523f, 3.85523f, 9.74458f, 3.65224f, 10.2346f)
        curveTo(3.5f, 10.6022f, 3.5f, 11.0681f, 3.5f, 12f)
        curveTo(3.5f, 12.9319f, 3.5f, 13.3978f, 3.65224f, 13.7654f)
        curveTo(3.85523f, 14.2554f, 4.24458f, 14.6448f, 4.73463f, 14.8478f)
        curveTo(5.10218f, 15f, 5.56812f, 15f, 6.5f, 15f)
        horizontalLineTo(12.5f)
        verticalLineTo(15.544f)
        curveTo(12.5f, 17.6268f, 12.5f, 18.6681f, 13.1003f, 18.9422f)
        curveTo(13.7006f, 19.2163f, 14.4183f, 18.5026f, 15.8536f, 17.0751f)
        lineTo(19.4172f, 13.5311f)
        curveTo(20.1391f, 12.8132f, 20.5f, 12.4542f, 20.5f, 12f)
        curveTo(20.5f, 11.5458f, 20.1391f, 11.1868f, 19.4172f, 10.4689f)
        lineTo(15.8536f, 6.92487f)
        curveTo(14.4183f, 5.49743f, 13.7006f, 4.78372f, 13.1003f, 5.05779f)
        curveTo(12.5f, 5.33185f, 12.5f, 6.37322f, 12.5f, 8.45596f)
        }
        }.build()

        return _arrowRightBig!!
    }

private var _arrowRightBig: ImageVector? = null
