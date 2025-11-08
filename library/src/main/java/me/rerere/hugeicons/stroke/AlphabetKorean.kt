package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AlphabetKorean: ImageVector
    get() {
        if (_alphabetKorean != null) {
            return _alphabetKorean!!
        }
        _alphabetKorean = ImageVector.Builder(
            name = "AlphabetKorean",
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
        moveTo(5f, 6f)
        horizontalLineTo(11.1554f)
        curveTo(12.0231f, 6f, 12.4569f, 6f, 12.7534f, 6.31741f)
        curveTo(13.0498f, 6.63483f, 13.0234f, 7.02125f, 12.9707f, 7.79408f)
        curveTo(12.7255f, 11.3825f, 10.8793f, 17.0157f, 5f, 19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 3f)
        verticalLineTo(12f)
        moveTo(16f, 21f)
        verticalLineTo(12f)
        moveTo(16f, 12f)
        horizontalLineTo(19f)
        }
        }.build()

        return _alphabetKorean!!
    }

private var _alphabetKorean: ImageVector? = null
