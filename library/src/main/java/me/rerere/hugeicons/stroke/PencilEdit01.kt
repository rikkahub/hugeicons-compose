package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PencilEdit01: ImageVector
    get() {
        if (_pencilEdit01 != null) {
            return _pencilEdit01!!
        }
        _pencilEdit01 = ImageVector.Builder(
            name = "PencilEdit01",
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
        moveTo(15.2141f, 5.98239f)
        lineTo(16.6158f, 4.58063f)
        curveTo(17.39f, 3.80646f, 18.6452f, 3.80646f, 19.4194f, 4.58063f)
        curveTo(20.1935f, 5.3548f, 20.1935f, 6.60998f, 19.4194f, 7.38415f)
        lineTo(18.0176f, 8.78591f)
        moveTo(15.2141f, 5.98239f)
        lineTo(6.98023f, 14.2163f)
        curveTo(5.93493f, 15.2616f, 5.41226f, 15.7842f, 5.05637f, 16.4211f)
        curveTo(4.70047f, 17.058f, 4.3424f, 18.5619f, 4f, 20f)
        curveTo(5.43809f, 19.6576f, 6.94199f, 19.2995f, 7.57889f, 18.9436f)
        curveTo(8.21579f, 18.5877f, 8.73844f, 18.0651f, 9.78375f, 17.0198f)
        lineTo(18.0176f, 8.78591f)
        moveTo(15.2141f, 5.98239f)
        lineTo(18.0176f, 8.78591f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 20f)
        horizontalLineTo(17f)
        }
        }.build()

        return _pencilEdit01!!
    }

private var _pencilEdit01: ImageVector? = null
