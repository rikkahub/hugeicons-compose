package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.InequalityCircle02: ImageVector
    get() {
        if (_inequalityCircle02 != null) {
            return _inequalityCircle02!!
        }
        _inequalityCircle02 = ImageVector.Builder(
            name = "InequalityCircle02",
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
        curveTo(6.4772f, 22f, 2f, 17.5228f, 2f, 12f)
        curveTo(2f, 6.47715f, 6.4772f, 2f, 12f, 2f)
        curveTo(17.5229f, 2f, 22f, 6.47715f, 22f, 12f)
        curveTo(22f, 17.5228f, 17.5229f, 22f, 12f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.0201f, 7.5f)
        lineTo(15.8641f, 12.6714f)
        curveTo(16.2001f, 13.08f, 15.8711f, 13.5f, 15.4201f, 13.5f)
        horizontalLineTo(8.00415f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.0195f, 16.5f)
        horizontalLineTo(7.99773f)
        }
        }.build()

        return _inequalityCircle02!!
    }

private var _inequalityCircle02: ImageVector? = null
