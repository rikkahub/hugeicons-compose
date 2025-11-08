package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Bicycle: ImageVector
    get() {
        if (_bicycle != null) {
            return _bicycle!!
        }
        _bicycle = ImageVector.Builder(
            name = "Bicycle",
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
        moveTo(6f, 19.9986f)
        curveTo(8.20914f, 19.9986f, 10f, 18.2112f, 10f, 16.0063f)
        curveTo(10f, 13.8014f, 8.20914f, 12.0139f, 6f, 12.0139f)
        curveTo(3.79086f, 12.0139f, 2f, 13.8014f, 2f, 16.0063f)
        curveTo(2f, 18.2112f, 3.79086f, 19.9986f, 6f, 19.9986f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 19.9986f)
        curveTo(20.2091f, 19.9986f, 22f, 18.2112f, 22f, 16.0063f)
        curveTo(22f, 13.8014f, 20.2091f, 12.0139f, 18f, 12.0139f)
        curveTo(15.7909f, 12.0139f, 14f, 13.8014f, 14f, 16.0063f)
        curveTo(14f, 18.2112f, 15.7909f, 19.9986f, 18f, 19.9986f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 16.0062f)
        horizontalLineTo(10.3706f)
        curveTo(10.7302f, 16.0062f, 11.0622f, 15.8135f, 11.2399f, 15.5014f)
        lineTo(15.5f, 8.02148f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 13.012f)
        lineTo(7f, 7.02344f)
        moveTo(7f, 7.02344f)
        horizontalLineTo(5f)
        moveTo(7f, 7.02344f)
        horizontalLineTo(9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.0531f, 15.9709f)
        lineTo(14.8057f, 4.03097f)
        curveTo(16.2565f, 3.96037f, 19.3585f, 3.83085f, 19.9908f, 6.21002f)
        }
        }.build()

        return _bicycle!!
    }

private var _bicycle: ImageVector? = null
