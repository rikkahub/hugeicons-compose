package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.NewTwitter: ImageVector
    get() {
        if (_newTwitter != null) {
            return _newTwitter!!
        }
        _newTwitter = ImageVector.Builder(
            name = "NewTwitter",
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
        moveTo(3f, 21f)
        lineTo(10.5484f, 13.4516f)
        moveTo(21f, 3f)
        lineTo(13.4516f, 10.5484f)
        moveTo(13.4516f, 10.5484f)
        lineTo(8f, 3f)
        horizontalLineTo(3f)
        lineTo(10.5484f, 13.4516f)
        moveTo(13.4516f, 10.5484f)
        lineTo(21f, 21f)
        horizontalLineTo(16f)
        lineTo(10.5484f, 13.4516f)
        }
        }.build()

        return _newTwitter!!
    }

private var _newTwitter: ImageVector? = null
