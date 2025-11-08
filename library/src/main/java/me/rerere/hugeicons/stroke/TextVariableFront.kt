package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TextVariableFront: ImageVector
    get() {
        if (_textVariableFront != null) {
            return _textVariableFront!!
        }
        _textVariableFront = ImageVector.Builder(
            name = "TextVariableFront",
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
        moveTo(7.5f, 15f)
        horizontalLineTo(4.5f)
        moveTo(6f, 3f)
        verticalLineTo(15f)
        moveTo(6f, 3f)
        curveTo(5.20721f, 3f, 4.18884f, 3.11448f, 3.37806f, 3.22723f)
        curveTo(3.03514f, 3.27492f, 2.86368f, 3.29877f, 2.71192f, 3.38287f)
        curveTo(2.39625f, 3.55779f, 2.1418f, 3.94131f, 2.04604f, 4.38652f)
        curveTo(2f, 4.60057f, 2f, 4.84482f, 2f, 5.33333f)
        moveTo(6f, 3f)
        curveTo(6.79279f, 3f, 7.81116f, 3.11448f, 8.62194f, 3.22723f)
        curveTo(8.96486f, 3.27492f, 9.13632f, 3.29877f, 9.28808f, 3.38287f)
        curveTo(9.60375f, 3.55779f, 9.8582f, 3.94131f, 9.95396f, 4.38652f)
        curveTo(10f, 4.60057f, 10f, 4.84482f, 10f, 5.33333f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.5f, 15f)
        horizontalLineTo(16.5f)
        moveTo(18f, 3f)
        verticalLineTo(15f)
        moveTo(18f, 3f)
        curveTo(17.2072f, 3f, 16.1888f, 3.11448f, 15.3781f, 3.22723f)
        curveTo(15.0351f, 3.27492f, 14.8637f, 3.29877f, 14.7119f, 3.38287f)
        curveTo(14.3963f, 3.55779f, 14.1418f, 3.94131f, 14.046f, 4.38652f)
        curveTo(14f, 4.60057f, 14f, 4.84482f, 14f, 5.33333f)
        moveTo(18f, 3f)
        curveTo(18.7928f, 3f, 19.8112f, 3.11448f, 20.6219f, 3.22723f)
        curveTo(20.9649f, 3.27492f, 21.1363f, 3.29877f, 21.2881f, 3.38287f)
        curveTo(21.6037f, 3.55779f, 21.8582f, 3.94131f, 21.954f, 4.38652f)
        curveTo(22f, 4.60057f, 22f, 4.84482f, 22f, 5.33333f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 19f)
        horizontalLineTo(10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 19f)
        lineTo(22f, 19f)
        }
        }.build()

        return _textVariableFront!!
    }

private var _textVariableFront: ImageVector? = null
