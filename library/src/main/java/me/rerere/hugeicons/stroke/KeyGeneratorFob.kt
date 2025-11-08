package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.KeyGeneratorFob: ImageVector
    get() {
        if (_keyGeneratorFob != null) {
            return _keyGeneratorFob!!
        }
        _keyGeneratorFob = ImageVector.Builder(
            name = "KeyGeneratorFob",
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
        moveTo(12f, 22f)
        curveTo(15.866f, 22f, 19f, 18.8659f, 19f, 15f)
        curveTo(19f, 12.5994f, 18.2288f, 8.16743f, 17.6442f, 5.15254f)
        curveTo(17.3548f, 3.66024f, 17.2101f, 2.91408f, 16.6559f, 2.45704f)
        curveTo(16.1018f, 2f, 15.3282f, 2f, 13.7811f, 2f)
        horizontalLineTo(10.2189f)
        curveTo(8.6718f, 2f, 7.89823f, 2f, 7.34406f, 2.45704f)
        curveTo(6.78988f, 2.91408f, 6.64519f, 3.66023f, 6.35582f, 5.15254f)
        curveTo(5.7712f, 8.16743f, 5f, 12.5994f, 5f, 15f)
        curveTo(5f, 18.8659f, 8.13399f, 22f, 12f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 15f)
        curveTo(16f, 17.2091f, 14.2091f, 19f, 12f, 19f)
        curveTo(9.79085f, 19f, 8f, 17.2091f, 8f, 15f)
        curveTo(8f, 12.7909f, 9.79085f, 11f, 12f, 11f)
        curveTo(14.2091f, 11f, 16f, 12.7909f, 16f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 5f)
        verticalLineTo(6f)
        }
        }.build()

        return _keyGeneratorFob!!
    }

private var _keyGeneratorFob: ImageVector? = null
