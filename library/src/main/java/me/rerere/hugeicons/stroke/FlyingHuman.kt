package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FlyingHuman: ImageVector
    get() {
        if (_flyingHuman != null) {
            return _flyingHuman!!
        }
        _flyingHuman = ImageVector.Builder(
            name = "FlyingHuman",
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
        moveTo(15.9939f, 5.49805f)
        curveTo(15.9939f, 6.32648f, 15.322f, 6.99805f, 14.4931f, 6.99805f)
        curveTo(13.6641f, 6.99805f, 12.9922f, 6.32648f, 12.9922f, 5.49805f)
        curveTo(12.9922f, 4.66962f, 13.6641f, 3.99805f, 14.4931f, 3.99805f)
        curveTo(15.322f, 3.99805f, 15.9939f, 4.66962f, 15.9939f, 5.49805f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 3f)
        curveTo(20.5f, 5f, 19.5f, 8f, 15f, 9f)
        curveTo(11.4857f, 9.78095f, 8.5f, 10f, 7f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 9.5f)
        curveTo(13.5f, 9.5f, 13f, 20.5f, 5f, 21f)
        moveTo(17f, 8.5f)
        curveTo(17f, 8.5f, 17.5f, 17f, 3f, 17f)
        }
        }.build()

        return _flyingHuman!!
    }

private var _flyingHuman: ImageVector? = null
