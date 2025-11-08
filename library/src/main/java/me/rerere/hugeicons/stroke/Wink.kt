package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Wink: ImageVector
    get() {
        if (_wink != null) {
            return _wink!!
        }
        _wink = ImageVector.Builder(
            name = "Wink",
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
        moveTo(8f, 14f)
        curveTo(8.91212f, 15.2144f, 10.3643f, 16f, 12f, 16f)
        curveTo(13.6357f, 16f, 15.0879f, 15.2144f, 16f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 8f)
        curveTo(15f, 8f, 14f, 9f, 14f, 10f)
        curveTo(14.75f, 9f, 16.25f, 9f, 17f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.00897f, 9f)
        horizontalLineTo(8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 16f)
        lineTo(14.2348f, 17.3203f)
        curveTo(14.644f, 17.9703f, 15.5502f, 18.1929f, 16.2589f, 17.8177f)
        curveTo(16.9676f, 17.4424f, 17.2104f, 16.6113f, 16.8012f, 15.9614f)
        lineTo(16f, 15f)
        }
        }.build()

        return _wink!!
    }

private var _wink: ImageVector? = null
