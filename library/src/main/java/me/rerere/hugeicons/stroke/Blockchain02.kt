package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Blockchain02: ImageVector
    get() {
        if (_blockchain02 != null) {
            return _blockchain02!!
        }
        _blockchain02 = ImageVector.Builder(
            name = "Blockchain02",
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
        curveTo(12.2443f, 22f, 12.4714f, 21.8869f, 12.9256f, 21.6608f)
        lineTo(16.5766f, 19.8432f)
        curveTo(18.1922f, 19.039f, 19f, 18.6368f, 19f, 18f)
        verticalLineTo(10f)
        moveTo(12f, 22f)
        curveTo(11.7557f, 22f, 11.5286f, 21.8869f, 11.0744f, 21.6608f)
        lineTo(7.42337f, 19.8432f)
        curveTo(5.80779f, 19.039f, 5f, 18.6368f, 5f, 18f)
        verticalLineTo(10f)
        moveTo(12f, 22f)
        verticalLineTo(14f)
        moveTo(19f, 10f)
        curveTo(19f, 9.36317f, 18.1922f, 8.96103f, 16.5766f, 8.15675f)
        lineTo(12.9256f, 6.33919f)
        curveTo(12.4714f, 6.11306f, 12.2443f, 6f, 12f, 6f)
        curveTo(11.7557f, 6f, 11.5286f, 6.11306f, 11.0744f, 6.33919f)
        lineTo(7.42337f, 8.15675f)
        curveTo(5.80779f, 8.96103f, 5f, 9.36317f, 5f, 10f)
        moveTo(19f, 10f)
        curveTo(19f, 10.6368f, 18.1922f, 11.039f, 16.5766f, 11.8432f)
        lineTo(12.9256f, 13.6608f)
        curveTo(12.4714f, 13.8869f, 12.2443f, 14f, 12f, 14f)
        moveTo(5f, 10f)
        curveTo(5f, 10.6368f, 5.80779f, 11.039f, 7.42337f, 11.8432f)
        lineTo(11.0744f, 13.6608f)
        curveTo(11.5286f, 13.8869f, 11.7557f, 14f, 12f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 21f)
        lineTo(19f, 18.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 2f)
        verticalLineTo(6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 21f)
        lineTo(5f, 18.5f)
        }
        }.build()

        return _blockchain02!!
    }

private var _blockchain02: ImageVector? = null
