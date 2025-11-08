package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AiSearch: ImageVector
    get() {
        if (_aiSearch != null) {
            return _aiSearch!!
        }
        _aiSearch = ImageVector.Builder(
            name = "AiSearch",
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
        moveTo(17.5f, 17.5f)
        lineTo(22f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 11f)
        curveTo(20f, 6.02944f, 15.9706f, 2f, 11f, 2f)
        curveTo(6.02944f, 2f, 2f, 6.02944f, 2f, 11f)
        curveTo(2f, 15.9706f, 6.02944f, 20f, 11f, 20f)
        curveTo(15.9706f, 20f, 20f, 15.9706f, 20f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.5f, 14f)
        lineTo(8.34189f, 8.47434f)
        curveTo(8.43631f, 8.19107f, 8.7014f, 8f, 9f, 8f)
        curveTo(9.2986f, 8f, 9.56369f, 8.19107f, 9.65811f, 8.47434f)
        lineTo(11.5f, 14f)
        moveTo(14.5f, 8f)
        verticalLineTo(14f)
        moveTo(7.5f, 12f)
        horizontalLineTo(10.5f)
        }
        }.build()

        return _aiSearch!!
    }

private var _aiSearch: ImageVector? = null
