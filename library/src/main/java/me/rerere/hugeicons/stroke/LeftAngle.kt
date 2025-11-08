package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LeftAngle: ImageVector
    get() {
        if (_leftAngle != null) {
            return _leftAngle!!
        }
        _leftAngle = ImageVector.Builder(
            name = "LeftAngle",
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
        moveTo(21f, 5f)
        curveTo(20.6068f, 4.59544f, 19.5602f, 3f, 19f, 3f)
        curveTo(18.4398f, 3f, 17.3932f, 4.59544f, 17f, 5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 17f)
        curveTo(4.59544f, 17.3932f, 3f, 18.4398f, 3f, 19f)
        curveTo(3f, 19.5602f, 4.59544f, 20.6068f, 5f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 12f)
        horizontalLineTo(18f)
        curveTo(15.1716f, 12f, 13.7574f, 12f, 12.8787f, 12.8787f)
        curveTo(12f, 13.7574f, 12f, 15.1716f, 12f, 18f)
        verticalLineTo(19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 19f)
        horizontalLineTo(13f)
        curveTo(15.8284f, 19f, 17.2426f, 19f, 18.1213f, 18.1479f)
        curveTo(19f, 17.2959f, 19f, 15.9245f, 19f, 13.1818f)
        verticalLineTo(3f)
        }
        }.build()

        return _leftAngle!!
    }

private var _leftAngle: ImageVector? = null
