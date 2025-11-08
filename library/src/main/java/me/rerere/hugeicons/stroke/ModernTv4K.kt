package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ModernTv4K: ImageVector
    get() {
        if (_modernTv4K != null) {
            return _modernTv4K!!
        }
        _modernTv4K = ImageVector.Builder(
            name = "ModernTv4K",
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
        moveTo(10.5f, 7f)
        verticalLineTo(10f)
        moveTo(10.5f, 10f)
        verticalLineTo(13f)
        moveTo(10.5f, 10f)
        horizontalLineTo(8.5f)
        curveTo(7.55719f, 10f, 7.08579f, 10f, 6.79289f, 9.70711f)
        curveTo(6.5f, 9.41421f, 6.5f, 8.94281f, 6.5f, 8f)
        verticalLineTo(7f)
        moveTo(13.5f, 13f)
        verticalLineTo(10f)
        moveTo(13.5f, 10f)
        verticalLineTo(7f)
        moveTo(13.5f, 10f)
        lineTo(17.5f, 7f)
        moveTo(13.5f, 10f)
        lineTo(17.5f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 10f)
        curveTo(2f, 6.22876f, 2f, 4.34315f, 3.17157f, 3.17157f)
        curveTo(4.34315f, 2f, 6.22876f, 2f, 10f, 2f)
        horizontalLineTo(14f)
        curveTo(17.7712f, 2f, 19.6569f, 2f, 20.8284f, 3.17157f)
        curveTo(22f, 4.34315f, 22f, 6.22876f, 22f, 10f)
        curveTo(22f, 13.7712f, 22f, 15.6569f, 20.8284f, 16.8284f)
        curveTo(19.6569f, 18f, 17.7712f, 18f, 14f, 18f)
        horizontalLineTo(10f)
        curveTo(6.22876f, 18f, 4.34315f, 18f, 3.17157f, 16.8284f)
        curveTo(2f, 15.6569f, 2f, 13.7712f, 2f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 22f)
        curveTo(14.8233f, 21.364f, 13.4571f, 21f, 12f, 21f)
        curveTo(10.5429f, 21f, 9.17669f, 21.364f, 8f, 22f)
        }
        }.build()

        return _modernTv4K!!
    }

private var _modernTv4K: ImageVector? = null
