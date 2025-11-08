package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Eraser01: ImageVector
    get() {
        if (_eraser01 != null) {
            return _eraser01!!
        }
        _eraser01 = ImageVector.Builder(
            name = "Eraser01",
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
        moveTo(2f, 12f)
        curveTo(2f, 8.22876f, 2f, 6.34315f, 3.17157f, 5.17157f)
        curveTo(4.34315f, 4f, 6.22876f, 4f, 10f, 4f)
        horizontalLineTo(13f)
        curveTo(14.9628f, 4f, 15.9443f, 4f, 16.7889f, 4.42229f)
        curveTo(17.6334f, 4.84458f, 18.2223f, 5.62972f, 19.4f, 7.2f)
        curveTo(21.1333f, 9.51111f, 22f, 10.6667f, 22f, 12f)
        curveTo(22f, 13.3333f, 21.1333f, 14.4889f, 19.4f, 16.8f)
        curveTo(18.2223f, 18.3703f, 17.6334f, 19.1554f, 16.7889f, 19.5777f)
        curveTo(15.9443f, 20f, 14.9628f, 20f, 13f, 20f)
        horizontalLineTo(10f)
        curveTo(6.22876f, 20f, 4.34315f, 20f, 3.17157f, 18.8284f)
        curveTo(2f, 17.6569f, 2f, 15.7712f, 2f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 9f)
        lineTo(8f, 14.9996f)
        moveTo(14f, 15f)
        lineTo(8f, 9.00039f)
        }
        }.build()

        return _eraser01!!
    }

private var _eraser01: ImageVector? = null
