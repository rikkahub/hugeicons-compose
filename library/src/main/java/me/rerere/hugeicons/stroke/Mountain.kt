package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Mountain: ImageVector
    get() {
        if (_mountain != null) {
            return _mountain!!
        }
        _mountain = ImageVector.Builder(
            name = "Mountain",
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
        moveTo(16f, 20f)
        horizontalLineTo(2f)
        lineTo(5.22457f, 10.7557f)
        curveTo(6.79555f, 6.25189f, 7.58104f, 4f, 9f, 4f)
        curveTo(10.3373f, 4f, 11.1119f, 6f, 12.5116f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 20f)
        horizontalLineTo(22f)
        lineTo(17.4066f, 12.6585f)
        curveTo(15.8806f, 10.2195f, 15.1176f, 9f, 14f, 9f)
        curveTo(12.8824f, 9f, 12.1194f, 10.2195f, 10.5934f, 12.6585f)
        lineTo(9.12837f, 15f)
        }
        }.build()

        return _mountain!!
    }

private var _mountain: ImageVector? = null
