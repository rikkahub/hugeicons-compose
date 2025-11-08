package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TextVerticalAlignment: ImageVector
    get() {
        if (_textVerticalAlignment != null) {
            return _textVerticalAlignment!!
        }
        _textVerticalAlignment = ImageVector.Builder(
            name = "TextVerticalAlignment",
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
        moveTo(13f, 4f)
        lineTo(22f, 4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 8f)
        lineTo(22f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 12f)
        horizontalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 20f)
        lineTo(22f, 20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 16f)
        lineTo(22f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 8.5f)
        lineTo(6.71429f, 5.5f)
        moveTo(6.71429f, 5.5f)
        lineTo(5.58623f, 2.86786f)
        curveTo(5.55491f, 2.7948f, 5.53926f, 2.75827f, 5.51945f, 2.72724f)
        curveTo(5.44354f, 2.60832f, 5.31395f, 2.527f, 5.16623f, 2.50559f)
        curveTo(5.12769f, 2.5f, 5.08512f, 2.5f, 5f, 2.5f)
        curveTo(4.91488f, 2.5f, 4.87231f, 2.5f, 4.83377f, 2.50559f)
        curveTo(4.68605f, 2.527f, 4.55646f, 2.60831f, 4.48055f, 2.72724f)
        curveTo(4.46074f, 2.75826f, 4.44509f, 2.7948f, 4.41377f, 2.86786f)
        lineTo(3.28571f, 5.5f)
        moveTo(6.71429f, 5.5f)
        lineTo(3.28571f, 5.5f)
        moveTo(3.28571f, 5.5f)
        lineTo(2f, 8.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 21.5f)
        lineTo(6.71429f, 18.5f)
        moveTo(6.71429f, 18.5f)
        lineTo(5.58623f, 15.8679f)
        curveTo(5.55491f, 15.7948f, 5.53926f, 15.7583f, 5.51945f, 15.7272f)
        curveTo(5.44354f, 15.6083f, 5.31395f, 15.527f, 5.16623f, 15.5056f)
        curveTo(5.12769f, 15.5f, 5.08512f, 15.5f, 5f, 15.5f)
        curveTo(4.91488f, 15.5f, 4.87231f, 15.5f, 4.83377f, 15.5056f)
        curveTo(4.68605f, 15.527f, 4.55646f, 15.6083f, 4.48055f, 15.7272f)
        curveTo(4.46074f, 15.7583f, 4.44509f, 15.7948f, 4.41377f, 15.8679f)
        lineTo(3.28571f, 18.5f)
        moveTo(6.71429f, 18.5f)
        lineTo(3.28571f, 18.5f)
        moveTo(3.28571f, 18.5f)
        lineTo(2f, 21.5f)
        }
        }.build()

        return _textVerticalAlignment!!
    }

private var _textVerticalAlignment: ImageVector? = null
