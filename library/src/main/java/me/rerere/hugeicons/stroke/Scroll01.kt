package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Scroll01: ImageVector
    get() {
        if (_scroll01 != null) {
            return _scroll01!!
        }
        _scroll01 = ImageVector.Builder(
            name = "Scroll01",
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
        moveTo(6f, 9f)
        horizontalLineTo(4.57143f)
        curveTo(3.56905f, 9f, 3.06786f, 9f, 2.70195f, 8.77009f)
        curveTo(2.51115f, 8.6502f, 2.3498f, 8.48885f, 2.22991f, 8.29805f)
        curveTo(2f, 7.93214f, 2f, 7.43095f, 2f, 6.42857f)
        verticalLineTo(5f)
        curveTo(2f, 3.89543f, 2.89543f, 3f, 4f, 3f)
        curveTo(5.10457f, 3f, 6f, 3.89543f, 6f, 5f)
        verticalLineTo(9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 9f)
        verticalLineTo(19f)
        curveTo(6f, 20.1046f, 6.89543f, 21f, 8f, 21f)
        moveTo(8f, 21f)
        horizontalLineTo(19.1429f)
        curveTo(19.9408f, 21f, 20.3398f, 21f, 20.6606f, 20.8878f)
        curveTo(21.2351f, 20.6867f, 21.6867f, 20.2351f, 21.8878f, 19.6606f)
        curveTo(22f, 19.3398f, 22f, 18.9408f, 22f, 18.1429f)
        curveTo(22f, 17.5444f, 22f, 17.2451f, 21.9158f, 17.0046f)
        curveTo(21.7651f, 16.5737f, 21.4263f, 16.2349f, 20.9954f, 16.0842f)
        curveTo(20.7549f, 16f, 20.4556f, 16f, 19.8571f, 16f)
        horizontalLineTo(13f)
        curveTo(11.5858f, 16f, 10.8787f, 16f, 10.4393f, 16.4393f)
        curveTo(10f, 16.8787f, 10f, 17.5858f, 10f, 19f)
        curveTo(10f, 20.1046f, 9.10457f, 21f, 8f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 3f)
        horizontalLineTo(14f)
        curveTo(16.357f, 3f, 17.5355f, 3f, 18.2678f, 3.73223f)
        curveTo(19f, 4.46447f, 19f, 5.64298f, 19f, 8f)
        verticalLineTo(16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 7f)
        horizontalLineTo(15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 11f)
        horizontalLineTo(13f)
        }
        }.build()

        return _scroll01!!
    }

private var _scroll01: ImageVector? = null
