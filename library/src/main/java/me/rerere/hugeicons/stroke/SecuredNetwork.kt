package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SecuredNetwork: ImageVector
    get() {
        if (_securedNetwork != null) {
            return _securedNetwork!!
        }
        _securedNetwork = ImageVector.Builder(
            name = "SecuredNetwork",
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
        moveTo(6f, 13f)
        curveTo(6f, 9.68629f, 8.68629f, 7f, 12f, 7f)
        curveTo(15.3137f, 7f, 18f, 9.68629f, 18f, 13f)
        curveTo(18f, 16.3137f, 15.3137f, 19f, 12f, 19f)
        curveTo(8.68629f, 19f, 6f, 16.3137f, 6f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5f, 8f)
        verticalLineTo(5.52063f)
        curveTo(15.5f, 3.57624f, 13.933f, 2f, 12f, 2f)
        curveTo(10.067f, 2f, 8.5f, 3.57624f, 8.5f, 5.52063f)
        verticalLineTo(8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.9998f, 13f)
        horizontalLineTo(12.0088f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 19f)
        verticalLineTo(22f)
        moveTo(12f, 22f)
        horizontalLineTo(20f)
        moveTo(12f, 22f)
        horizontalLineTo(4f)
        }
        }.build()

        return _securedNetwork!!
    }

private var _securedNetwork: ImageVector? = null
