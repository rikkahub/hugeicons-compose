package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArrowDown05: ImageVector
    get() {
        if (_arrowDown05 != null) {
            return _arrowDown05!!
        }
        _arrowDown05 = ImageVector.Builder(
            name = "ArrowDown05",
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
        moveTo(6f, 19.9985f)
        horizontalLineTo(17.9997f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.996f, 4.00195f)
        verticalLineTo(11.53f)
        moveTo(14.5055f, 14.5899f)
        lineTo(15.9502f, 12.6384f)
        curveTo(16.2907f, 12.1784f, 15.9594f, 11.53f, 15.3839f, 11.53f)
        horizontalLineTo(8.67439f)
        curveTo(8.10419f, 11.53f, 7.77156f, 12.1679f, 8.10132f, 12.6291f)
        lineTo(9.50342f, 14.5899f)
        lineTo(11.444f, 16.9564f)
        curveTo(11.7237f, 17.2976f, 12.2484f, 17.2996f, 12.5307f, 16.9606f)
        lineTo(14.5055f, 14.5899f)
        }
        }.build()

        return _arrowDown05!!
    }

private var _arrowDown05: ImageVector? = null
