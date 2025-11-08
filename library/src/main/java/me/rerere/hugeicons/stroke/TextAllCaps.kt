package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TextAllCaps: ImageVector
    get() {
        if (_textAllCaps != null) {
            return _textAllCaps!!
        }
        _textAllCaps = ImageVector.Builder(
            name = "TextAllCaps",
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
        moveTo(10.5714f, 21f)
        horizontalLineTo(5.42857f)
        moveTo(8f, 3f)
        verticalLineTo(21f)
        moveTo(8f, 3f)
        curveTo(6.81082f, 3f, 5.28326f, 3.12265f, 4.06709f, 3.24346f)
        curveTo(3.55271f, 3.29456f, 3.29552f, 3.32011f, 3.06788f, 3.41021f)
        curveTo(2.59438f, 3.59763f, 2.21271f, 4.00855f, 2.06906f, 4.48556f)
        curveTo(2f, 4.71489f, 2f, 4.97659f, 2f, 5.5f)
        moveTo(8f, 3f)
        curveTo(8.60727f, 3f, 9.30278f, 3.03198f, 10f, 3.07938f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.5706f, 21f)
        horizontalLineTo(13.4277f)
        moveTo(15.9992f, 3f)
        verticalLineTo(21f)
        moveTo(15.9992f, 3f)
        curveTo(17.1883f, 3f, 18.7159f, 3.12265f, 19.9321f, 3.24346f)
        curveTo(20.4465f, 3.29456f, 20.7036f, 3.32011f, 20.9313f, 3.41021f)
        curveTo(21.4048f, 3.59763f, 21.7865f, 4.00855f, 21.9301f, 4.48556f)
        curveTo(21.9992f, 4.71489f, 21.9992f, 4.97659f, 21.9992f, 5.5f)
        moveTo(15.9992f, 3f)
        curveTo(15.3921f, 3f, 14.6968f, 3.03196f, 13.9999f, 3.07933f)
        }
        }.build()

        return _textAllCaps!!
    }

private var _textAllCaps: ImageVector? = null
