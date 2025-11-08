package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.EaseInControlPoint: ImageVector
    get() {
        if (_easeInControlPoint != null) {
            return _easeInControlPoint!!
        }
        _easeInControlPoint = ImageVector.Builder(
            name = "EaseInControlPoint",
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
        moveTo(20f, 3f)
        curveTo(20f, 3f, 13f, 19f, 2f, 19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 19f)
        horizontalLineTo(13f)
        moveTo(16f, 19f)
        lineTo(18f, 19f)
        moveTo(18f, 19f)
        curveTo(18f, 20.1046f, 18.8954f, 21f, 20f, 21f)
        curveTo(21.1046f, 21f, 22f, 20.1046f, 22f, 19f)
        curveTo(22f, 17.8954f, 21.1046f, 17f, 20f, 17f)
        curveTo(18.8954f, 17f, 18f, 17.8954f, 18f, 19f)
        }
        }.build()

        return _easeInControlPoint!!
    }

private var _easeInControlPoint: ImageVector? = null
