package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SafeBox: ImageVector
    get() {
        if (_safeBox != null) {
            return _safeBox!!
        }
        _safeBox = ImageVector.Builder(
            name = "SafeBox",
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
        moveTo(21f, 11f)
        verticalLineTo(13f)
        curveTo(21f, 16.7712f, 21f, 18.6569f, 19.8284f, 19.8284f)
        curveTo(18.6569f, 21f, 16.7712f, 21f, 13f, 21f)
        horizontalLineTo(11f)
        curveTo(7.22876f, 21f, 5.34315f, 21f, 4.17157f, 19.8284f)
        curveTo(3f, 18.6569f, 3f, 16.7712f, 3f, 13f)
        verticalLineTo(11f)
        curveTo(3f, 7.22876f, 3f, 5.34315f, 4.17157f, 4.17157f)
        curveTo(5.34315f, 3f, 7.22876f, 3f, 11f, 3f)
        horizontalLineTo(13f)
        curveTo(16.7712f, 3f, 18.6569f, 3f, 19.8284f, 4.17157f)
        curveTo(21f, 5.34315f, 21f, 7.22876f, 21f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 12f)
        curveTo(16f, 14.2091f, 14.2091f, 16f, 12f, 16f)
        curveTo(9.79086f, 16f, 8f, 14.2091f, 8f, 12f)
        curveTo(8f, 9.79086f, 9.79086f, 8f, 12f, 8f)
        curveTo(14.2091f, 8f, 16f, 9.79086f, 16f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.5f, 8f)
        horizontalLineTo(5f)
        moveTo(3.5f, 16f)
        horizontalLineTo(5f)
        }
        }.build()

        return _safeBox!!
    }

private var _safeBox: ImageVector? = null
